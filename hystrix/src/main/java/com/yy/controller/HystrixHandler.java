package com.yy.controller;

import com.yy.entity.Student;
import com.yy.feign.FeignYyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {
    @Autowired
    private FeignYyClient feignYyClient;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignYyClient.findAll();
    }
    @GetMapping("/index")
    public String index(){
        return feignYyClient.index();
    }
}
