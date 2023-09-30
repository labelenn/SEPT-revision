package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String getHelloMessage(String user) {
        return "Hello, " + user + "!";
    }
}
