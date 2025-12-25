package com.example.demo.controller;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
class StudentController{
  Student st=new Student();
  @GetMapping("/name")
  public String getStudentName(){
    return st.getName();
  }
  @PostMapping("/name")
  public void addStudentName(@RequestBody String stName){
      st.setName(stName);
  }
}
