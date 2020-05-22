package com.octacore.chbaselearning.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/version")
public class HomeController {

    @Value("app.version")
    String app_version;

    @GetMapping
//    @RequestMapping("/")
    public Map getApp_version(){
        Map map = new HashMap<String,String>();
        map.put("app_version",app_version);
        return map;
    }
}