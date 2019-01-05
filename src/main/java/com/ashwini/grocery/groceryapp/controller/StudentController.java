package com.ashwini.grocery.groceryapp.controller;

import com.ashwini.grocery.groceryapp.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping("/student")
    public void xyz(){
       studentService.saveStudent();
    }
}
