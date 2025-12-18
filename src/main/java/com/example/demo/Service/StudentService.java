package com.example.demo.Service;
import java.util.*;
import com.example.demo.entity.Student;
public interface StudentService{
    Student poststudent(Student st);
    List<Student> getAllStudents();
    Optional<Student>getbyId(long id);
    string updateData(Long)
}