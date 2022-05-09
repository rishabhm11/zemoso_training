package com.zemoso.springdemo.service;

import com.zemoso.springdemo.dao.StudentDao;
import com.zemoso.springdemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional
    public List<Student> getStudents() {
        return studentDao.getStudents();
    }

    @Override
    @Transactional
    public void saveStudent(Student theStudent) {
        studentDao.saveStudent(theStudent);
    }

    @Override
    @Transactional
    public Student getStudent(int theId) {
        return studentDao.getStudent(theId);
    }

    @Override
    @Transactional
    public void deleteStudent(int theId) {
        studentDao.deleteStudent(theId);
    }
}