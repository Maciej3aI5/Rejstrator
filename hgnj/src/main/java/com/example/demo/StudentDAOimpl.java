package com.example.demo;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOimpl implements StudentDAO{
    EntityManager entityManager;
    @Autowired
    public  StudentDAOimpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }
    public List<Student> find(){
        List<Student>studentList=entityManager.createNativeQuery("SELECT * FROM studenci",Student.class).getResultList();
        return studentList;
    }
    @Transactional
    public void update(int id) {
        entityManager.createNativeQuery("UPDATE studenci SET imie = 'Bartek'")
                .executeUpdate();  // Wykonanie zapytania UPDATE
    }

}
