package com.example.demo_spring.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    private String rollNumber;
    private String fullName;
    @OneToMany(mappedBy = "student")
    private Set<com.example.demo_spring.ManyToMany.StudentGrade> StudentGrade;

}
