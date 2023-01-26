package com.example.demo.student.controller;

import com.example.demo.student.service.StudentService;
import com.example.demo.student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> list() {
        return studentService.findStudent();
    }
}
