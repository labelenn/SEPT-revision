package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Demo;
import com.example.demo.Repository.DemoRepo;

@Service
public class DemoServiceImpl implements DemoService {
    private final DemoRepo demoRepository;

    @Autowired
    public DemoServiceImpl(DemoRepo demoRepository) {
        this.demoRepository = demoRepository;
    }

    @Override
    public String getHelloMessage() {
        return demoRepository.getHelloMessage();
    }
}
