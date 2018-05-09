package com.wang.springboot.faceapi.controller;

import com.wang.springboot.cloudbeans.ResultInfo;
import com.wang.springboot.faceapi.feign.AdminFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private AdminFeign adminFeign;

    @GetMapping("test")
    public ResultInfo foo() {
        return adminFeign.userDetail();
    }
}
