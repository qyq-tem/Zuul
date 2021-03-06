package com.gg.repository;

import com.gg.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> findAll();

    public Student findById(long id);

    public void save(Student student);

    public void deleteById(long id);
}
