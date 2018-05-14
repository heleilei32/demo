package com.example.controller;

import com.example.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "hello java 世界";
    }

    @RequestMapping("/student")
    public Student student(){
        Student student = new Student();
        student.setName("小红");
        student.setAge(23);
        student.setSex("男");
        student.setCreateTime(new Date());
        return student;
    }


}
