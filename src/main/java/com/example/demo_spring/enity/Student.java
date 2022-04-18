package com.example.demo_spring.enity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String rollNumber;
    private String fullName;
    private String email;
    private String address;
    private int status;

    public Student(String rollNumber, String fullName) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
    }
}
