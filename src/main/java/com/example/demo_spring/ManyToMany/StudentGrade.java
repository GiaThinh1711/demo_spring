package com.example.demo_spring.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students_grades")
public class StudentGrade {
    @EmbeddedId
    private StudentGradeId id;
    @ManyToOne
    @MapsId("gradeId")
    @JoinColumn(name = "grade_id")
    private Grade grade;
    @ManyToOne
    @MapsId("studentRollNumber")
    @JoinColumn(name ="student_rollnumber")
    private Student student;
}
