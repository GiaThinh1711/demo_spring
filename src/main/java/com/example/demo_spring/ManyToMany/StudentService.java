package com.example.demo_spring.ManyToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student save(Student student){
        studentRepository.save(student);
        return student;
    }
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
