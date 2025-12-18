package com.example.demo.Service;
import java.util.*;
import com.example.demo.entity.Student;
public interface StudentService{
    Student poststudent(Student st);
    List<student> getAllStudents();
    Optional<student>getbyId(long id);
    string updateData(Long)
}