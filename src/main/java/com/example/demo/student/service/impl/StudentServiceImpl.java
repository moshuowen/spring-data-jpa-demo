package com.example.demo.student.service.impl;

import com.example.demo.student.entity.Student;
import com.example.demo.student.repository.StudentRepository;
import com.example.demo.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findStudent() {
        return studentRepository.findAll();
    }
}
