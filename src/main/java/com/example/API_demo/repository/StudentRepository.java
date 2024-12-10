package com.example.API_demo.repository;

import com.example.API_demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository <Student,Long> {
    Student findByName(String name);

    Optional<Object> findById(int id);

    Student save(Student student);

    void deleteById(int id);
}
