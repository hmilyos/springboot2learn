package com.hmily.basic.controller.web;

import com.hmily.basic.common.exception.CustomRuntimeException;
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

    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }

    @RequestMapping("/customException")
    public int customException(Integer id){
        if (id == 0){
            throw new CustomRuntimeException("id不能为0");
        }
        return 100;
    }
}
