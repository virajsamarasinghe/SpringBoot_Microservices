package com.springbootmicroservice.department_service.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope

public class MessageController {


    @Value("${spring.boot.message}")
    private String message;

    @GetMapping("message")
    public String message() {
        return message;
    }

}
