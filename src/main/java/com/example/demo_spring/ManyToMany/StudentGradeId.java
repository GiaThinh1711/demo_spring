package com.example.demo_spring.ManyToMany;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class StudentGradeId implements Serializable {
    @Column(name = "grade_id")
    private int gradeId;
    @Column(name = "student_rollnumber")
    private String studentRollNumber;
}
