package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoRestController {
    StudentDAOimpl studentDAOimpl;
    @Autowired
    public DemoRestController(StudentDAOimpl studentDAOimpl){
        this.studentDAOimpl=studentDAOimpl;
    }
    @GetMapping("/")
    public String createStudent(){
        Student student = new Student("Maciej");
        try{
            studentDAOimpl.save(student);
            return "Succesfull";

        }
        catch (Exception e){
            return ""+e;
        }
    }
    @GetMapping("/get")
    public List<Student> getStudent()
    {
        return studentDAOimpl.find();
    }
    @GetMapping("update")
    public String updateStudent(){
        try{
            studentDAOimpl.update(1);
            return "succes";
        }
        catch (Exception e){
            return ":"+e;
        }
    }


}
