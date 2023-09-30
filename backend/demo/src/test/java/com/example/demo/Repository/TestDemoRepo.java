package com.example.demo.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDemoRepo {

    @Autowired
    private DemoRepo demoRepo;

    @Test
    public void testGetHelloMessage() {
        String expected = "Hello, DemoID: " + "1" + "\n" + "Hello, DemoID: " + "2" + "\n" + "Hello, DemoID: " + "3" + "\n";
        String actual = demoRepo.getHelloMessage();
        assert(expected.equals(actual));
    }
}
