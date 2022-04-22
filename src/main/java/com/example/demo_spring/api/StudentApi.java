package com.example.demo_spring.api;

import com.example.demo_spring.enity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/students")
public class StudentApi {
    private static List<Student> listStudent;

    static {
        listStudent = new ArrayList<>();
        listStudent.add(new Student("A01", "Gia Thinh", "thinhdau@gmail.com", "Tndas", 1));
    }

    @GetMapping
    public List<Student> getList() {
        return listStudent;
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        listStudent.add(student);
        return student;
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/{rollNumber}")
    public Student update(@PathVariable String rollNumber, @RequestBody Student updateStudent) {
        Student found = null;
        for (Student student : listStudent) {
            if (student.getRollNumber().equals(rollNumber)) {
                found = student;
                break;
            }
        }
        if (found != null) {
            found.setFullName(updateStudent.getFullName());
            found.setAddress(updateStudent.getAddress());
            found.setStatus(updateStudent.getStatus());
            found.setEmail(updateStudent.getEmail());
        }
        return found;
    }
    @RequestMapping(method = RequestMethod.DELETE, path = "/{rollNumber}")
    public String delete(@PathVariable String rollNumber) {
        Student found = null;
        for (Student student : listStudent) {
            if (student.getRollNumber().equals(rollNumber)) {
                found = student;
                break;
            }
        }
        if (found != null) {
            listStudent.remove(found);
        }
        return "ok";
    }
}
