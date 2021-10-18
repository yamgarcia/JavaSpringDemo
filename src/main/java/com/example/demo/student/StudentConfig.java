package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.MARCH;
import static java.time.Month.MAY;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){

        return args -> {
            Student marcos = new Student(
                    "Marcos",
                    "marcos@gmail.com",
                    LocalDate.of(1993, MAY, 1),
                    28
            );

            Student marian = new Student(
                    "Marian",
                    "marian@gmail.com",
                    LocalDate.of(1992, MARCH, 3),
                    29
            );

            repository.saveAll(
                    List.of(marcos, marian)
            );
        };
    }

}
