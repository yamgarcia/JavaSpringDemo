package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Add "repository" to anything that access your database
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {




}
