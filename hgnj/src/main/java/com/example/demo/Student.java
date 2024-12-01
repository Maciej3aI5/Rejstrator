package com.example.demo;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name="studenci")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="imie")
    private String name;
    public Student(){

    }
    public Student(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
