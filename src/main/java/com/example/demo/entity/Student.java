package com.example.demo.entity;

import java.time.LocalDate;

public class Student{
    private Long id;
    private String name;
    private String dept;
    private LocalDate dob;
    private float cgpa;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Long getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Long getDept(){
        return dept;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public Long getDob(){
        return dob;
    }
    public void setDob(LocalDate dob){
        this.dob=dob;
    }
    public Long getCgpa(){
        return cgpa;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
}
