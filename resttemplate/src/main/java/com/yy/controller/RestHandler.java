package com.yy.controller;

import com.yy.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RestHandler {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://localhost:8000/student/findAll",Collection.class);
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return restTemplate.getForEntity("http://localhost:8000/student/findById/{id}",Student.class,id).getBody();
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8000/student/save",student,String.class);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8000/student/update",student);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        restTemplate.delete("http://localhost:8000/student/deleteById/{id}",id);
    }
}
