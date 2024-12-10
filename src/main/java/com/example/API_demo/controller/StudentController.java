package com.example.API_demo.controller;

import com.example.API_demo.entity.Student;
import com.example.API_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return service.saveStudents(students);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return service.getStudents();
    }

    @GetMapping("/studentById/{id}")
    public Student findStudentById(@PathVariable Long id){
        return service.getStudentById(id);
    }

    @GetMapping("/studentByName/{name}")
    public Student findStudentByName(@PathVariable String name){
        return service.getStudentByName(name);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        return service.deleteStudent(id);
    }
}
