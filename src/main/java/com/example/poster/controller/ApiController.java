package com.example.poster.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

@RestController
public class ApiController {

    @GetMapping("/api/hello")
    public String hello() {
        return "안녕하세요. 현재 서버시간은 " + new Date() + "입니다.";
    }
}