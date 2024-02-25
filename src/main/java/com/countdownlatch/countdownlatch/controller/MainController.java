package com.countdownlatch.countdownlatch.controller;

import org.springframework.web.bind.annotation.RestController;

import com.countdownlatch.countdownlatch.service.MainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class MainController {

    @Autowired
    private MainService service;

    @GetMapping("service")
    public String getMethodName() throws InterruptedException {
        service.executeProcess();
        return "Success";
    }
    
}
