package com.hmily.basic.controller;

import com.hmily.basic.domain.JsonBean;
import com.hmily.basic.service.ITestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    private ITestService testService;

    @GetMapping("/msg")
    public String msg(){
        return "hello basic msg!";
    }

    @GetMapping("/getJson")
    public JsonBean getJson(long id){
        return testService.getJson(id);
    }

}
