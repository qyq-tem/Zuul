package com.gg.controller;

import com.gg.entity.Student;
import com.gg.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id) {
        return studentRepository.findById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.save(student);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.save(student);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteByid(@PathVariable("id") long id){
        studentRepository.deleteById(id);
    }
}
