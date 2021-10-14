package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Marcos Garcia",
                        "marcos@gmail.com",
                        LocalDate.of(1993, Month.MAY, 13),
                        28
                )
        );
    }
}
