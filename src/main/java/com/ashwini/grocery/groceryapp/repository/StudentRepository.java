package com.ashwini.grocery.groceryapp.repository;

import com.ashwini.grocery.groceryapp.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
