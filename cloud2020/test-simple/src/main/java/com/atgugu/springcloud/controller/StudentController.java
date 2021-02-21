package com.atgugu.springcloud.controller;

import com.atgugu.springcloud.entites.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping(value = "/student/get/{no}")
    public Student getStudent(@PathVariable("no") Long no){
        Student student = new Student();
        student.setNo(no);
        return student;
    }
}
