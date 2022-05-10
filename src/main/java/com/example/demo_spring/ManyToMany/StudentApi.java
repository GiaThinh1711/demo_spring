package com.example.demo_spring.ManyToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentApi {
    @Autowired
    StudentService studentService;
//    private static List<Student> listStudent;
//
//    static {
//        listStudent = new ArrayList<>();
//        listStudent.add(new Student("A01","Gia Thinh"));
//    }

    @RequestMapping(method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        System.out.println(student.getRollNumber());
        return studentService.save(student);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> findAll(){
        return studentService.findAll();
    }

}
