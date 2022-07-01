package com.controller;

import com.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    public Config config;

    @RequestMapping("/project_name")
    public String postMessage(){
         return config.getProjectName()+"user : "+config.getUser() +" Password "+config.getPassword() +"url'" +config.getUrl();
    }

    @RequestMapping("/hello")
    public String hello(){

        return "Hello";
    }
}
