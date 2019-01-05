package com.ashwini.grocery.groceryapp.service;

import com.ashwini.grocery.groceryapp.domain.Student;
import com.ashwini.grocery.groceryapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl {

    @Autowired
    private StudentRepository studentRepository;

    public void saveStudent() {
        Student student1 = new Student();
        student1.setName("Ashwini");
        student1.setAge(25);
        student1.setStudId(76);
        studentRepository.save(student1);
    }
}
