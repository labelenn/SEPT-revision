package com.example.demo.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;
import java.sql.Connection;

import org.springframework.stereotype.Repository;

import com.example.demo.Model.Demo;

@Repository
public class DemoRepoImpl implements DemoRepo{
    private final DataSource datasource;

    public DemoRepoImpl(DataSource datasource) {
        this.datasource = datasource;
    }

    @Override
    public String getHelloMessage() {
        String message = "";
        try {
            Connection connection = datasource.getConnection();
            PreparedStatement stm = connection.prepareStatement(
                "SELECT DemoID, DemoName\r\n" + //
                "FROM Demos;"
            );

            ResultSet rs = stm.executeQuery();

            while(rs.next()) {
                message += "Hello, " + "DemoID: " + rs.getInt("DemoID") + "\n";    
            }

            connection.close();
            return message;
            
        } catch (SQLException e) {
            throw new RuntimeException("Error in userFound()", e);
        }
    }
}
