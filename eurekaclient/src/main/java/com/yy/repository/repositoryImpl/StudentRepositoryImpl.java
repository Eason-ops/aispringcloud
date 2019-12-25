package com.yy.repository.repositoryImpl;

import com.yy.entity.Student;
import com.yy.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long,Student> studentMap;
    static {
        studentMap =new HashMap<>();
        studentMap.put(1L,new Student(1L,"T-Mac",35));
        studentMap.put(2L,new Student(2L,"AI",37));
        studentMap.put(3L,new Student(3L,"Jordan",47));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
