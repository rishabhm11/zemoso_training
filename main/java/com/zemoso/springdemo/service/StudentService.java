package com.zemoso.springdemo.service;

import com.zemoso.springdemo.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getStudents();
    public void saveStudent(Student theStudent);

    public Student getStudent(int theId);

    public void deleteStudent(int theId);
}
