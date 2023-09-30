package com.example.demo.Service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDemoService {
    DemoService demoService = new DemoService();

    @Test
    public void testGetHelloMessage() {
        String user = "John";
        String expected = "Hello " + user;
        String actual = demoService.getHelloMessage(user);
        assert(expected.equals(actual));
    }
}
