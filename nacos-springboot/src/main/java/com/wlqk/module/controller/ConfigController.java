package com.wlqk.module.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
//@RequestScope
@RefreshScope
public class ConfigController {



    @Value(value = "${title:null}")
//    @NacosValue(value = "value = ${title:null}",autoRefreshed = true)
    private String title;

    @GetMapping("/get")
    @ResponseBody
    public String hello() {
        return title;
    }

}
