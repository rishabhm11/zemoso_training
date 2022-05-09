package com.zemoso.springdemo.dao;

import com.zemoso.springdemo.entity.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> getStudents();

    public void saveStudent(Student theStudent);

    public Student getStudent(int theId);

    public void deleteStudent(int theId);
}
