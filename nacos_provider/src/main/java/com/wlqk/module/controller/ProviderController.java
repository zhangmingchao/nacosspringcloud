package com.wlqk.module.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {


    @GetMapping("/get")
    public String get(){
        return "SpringCloud alibaba 我来啦...";
    }



}
