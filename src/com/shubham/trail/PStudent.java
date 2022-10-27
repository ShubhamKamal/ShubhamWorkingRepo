package com.shubham.trail;

import com.shubham.trail.Student;

import java.util.List;
import java.util.Objects;

public class PStudent {
    private int id;
    private List<Student> student;

    public PStudent() {
        super();
    }

    public PStudent(int id, List<Student> student) {
        this.id = id;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "PStudent{" +
                "id=" + id +
                ", student=" + student +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PStudent)) return false;
        PStudent pStudent = (PStudent) o;
        return id == pStudent.id && Objects.equals(student, pStudent.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, student);
    }
}
