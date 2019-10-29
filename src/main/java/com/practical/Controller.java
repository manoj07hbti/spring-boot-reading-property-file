package com.practical;

import com.config.Config;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/handson")
@Api(value="Handson Practial", description="This is for Handson practical for Spring Boot App")

public class Controller {

    @Autowired
    public Config config;
    @ApiOperation(value = "welcome message")
    @RequestMapping(value = "/welcome",method = RequestMethod.GET,produces ="application/json" )

    public String message(){
        return "Welcome to SPring Boot";
    }

    @RequestMapping("/projectName")
    public String postMessage(){
         return config.getProjectName();
    }
}
