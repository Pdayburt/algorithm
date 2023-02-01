package com.anatkh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("test")
public class TestController {
    @Value("${read.code}")
    String url;
    @RequestMapping("getCode")
    public String getCode(){
        return url;
    }
}
