package org.generation.dependencies_injection.service;



import java.util.ArrayList;


import java.util.List;

import org.generation.dependencies_injection.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    public List<Student> students = new ArrayList<>();

    public Student alain(){
        return new Student ("1L", 10, "Alain", "Johnson", 3434);
    }
    
    public Student maria(){
        return new Student ("2L", 505, "Maria", "Santiago", 4567);
    }

    @Bean
    public void addStudents(){
        students.addAll(List.of(alain(), maria()));
    }

    @Override
    public void add(Student student) {
        return;
        
    }

    @Override
    public void delete(Student student) {
        
        return;
    }

    @Override
    public List<Student> all() {
        return students;
        
        
    }

    @Override
    public Student findById(String id) {
        return null;
        
        
    }

}
