package com.yy.feign.impl;

import com.yy.entity.Student;
import com.yy.feign.FeignYyClient;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class FeignError implements FeignYyClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器重启中...";
    }
}
