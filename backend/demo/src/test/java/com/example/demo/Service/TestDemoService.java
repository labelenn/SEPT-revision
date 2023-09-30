package com.example.demo.Service;
import com.example.demo.Repository.DemoRepo;

import org.mockito.Mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestDemoService {
    @Mock
    private DemoRepo demoRepo;
    private DemoServiceImpl demoService;


    @BeforeEach
    public void setUp() {
        demoService = new DemoServiceImpl(demoRepo);
    }

    @Test
    public void testGetHelloMessage() {
        when(demoRepo.getHelloMessage()).thenReturn("Hello, DemoID: " + "1" + "\n" + "Hello, DemoID: " + "2" + "\n" + "Hello, DemoID: " + "3" + "\n");
        String actual = demoService.getHelloMessage();
        assertEquals(demoRepo.getHelloMessage(), actual);
    }
}
