package com.study.controller;

import com.study.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebDataController {

    @GetMapping("getStudent")
    @ResponseBody
    public Student getStudentsData(){
        System.out.println("请求一次");
        return new Student("001","张三",20);

    }
}
