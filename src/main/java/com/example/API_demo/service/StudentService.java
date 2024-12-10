package com.example.API_demo.service;

import com.example.API_demo.entity.Student;
import com.example.API_demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student){
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> students){
        return repository.saveAll(students);
    }

    public List<Student> getStudents(){
        return repository.findAll();
    }

    public Student getStudentById(Long id){
        return (Student) repository.findById(id).orElse(null);
    }

    public Student getStudentByName(String name){
        return repository.findByName(name);
    }

    public String deleteStudent(Long id){
        repository.deleteById(id);
        return "Student is removed"+id;
    }

    public Student updateStudent(Student student){
        Student existingStudent = (Student) repository.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setGender(student.getGender());
        return repository.save(existingStudent);

    }

}


