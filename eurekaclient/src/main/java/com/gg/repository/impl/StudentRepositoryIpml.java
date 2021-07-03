package com.gg.repository.impl;

import com.gg.entity.Student;
import com.gg.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryIpml implements StudentRepository {
    private static Map<Long, Student> studentMap;
    static {
        studentMap = new HashMap<Long, Student>();
        studentMap.put(1L, new Student(1L, "张三", 22));
        studentMap.put(2L, new Student(1L, "李四", 21));
        studentMap.put(3L, new Student(3L, "王五", 24));
    }

    public Collection<Student> findAll() {
        return studentMap.values();
    }

    public Student findById(long id) {
        return studentMap.get(id);
    }

    public void save(Student student) {
        studentMap.put(student.getId(), student);
    }

    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
