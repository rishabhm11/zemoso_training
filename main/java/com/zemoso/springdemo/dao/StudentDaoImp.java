package com.zemoso.springdemo.dao;

import com.zemoso.springdemo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDaoImp implements StudentDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Student> getStudents() {
        Session currentSession= sessionFactory.getCurrentSession();
        Query<Student> query= currentSession.createQuery("from Student", Student.class);
        List<Student> students= query.getResultList();
        return students;
    }

    @Override
    public void saveStudent(Student theStudent) {
        Session currentSession=sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theStudent);
    }

    @Override
    public Student getStudent(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Student theStudent= currentSession.get(Student.class, theId);
        return theStudent;
    }

    @Override
    public void deleteStudent(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query= currentSession.createQuery("delete from Student where id=:theStudentId");
        query.setParameter("theStudentId",theId);
        query.executeUpdate();
    }
}
