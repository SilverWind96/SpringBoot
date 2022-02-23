package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

@Component
public class StudentService {
    public ArrayList<Student> getStudents() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1L, "1l", "1l", LocalDate.of(2000, Month.JUNE, 9), 10));
        return list;
    }
}
