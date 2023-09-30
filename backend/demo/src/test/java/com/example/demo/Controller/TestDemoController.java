package com.example.demo.Controller;
import com.example.demo.Service.DemoService;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDemoController {
    @Mock
    private DemoService demoService;
    private DemoController demoController;

    @BeforeEach
    public void setUp() {
        demoController = new DemoController(demoService);
    }

    @Test
    public void testGetHelloMessage() {
        when(demoService.getHelloMessage()).thenReturn("Hello, DemoID: " + "1" + "\n" + "Hello, DemoID: " + "2" + "\n" + "Hello, DemoID: " + "3" + "\n");
        String actual = demoController.getHelloMessage();
        assertEquals(demoService.getHelloMessage(), actual);
    }
}
