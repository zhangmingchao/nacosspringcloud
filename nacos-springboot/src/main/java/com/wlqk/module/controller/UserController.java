package com.wlqk.module.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @NacosValue(value = "${name:null}", autoRefreshed = true)
    private String name;

    @RequestMapping(value = "/getAll")
    @ResponseBody
    public String getUser() {
        return name;
    }
}
