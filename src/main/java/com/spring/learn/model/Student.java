package com.spring.learn.model;

import java.util.Objects;

public class Student {


    private int studentID;
    private String studentName;
    private String studentAddress;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        System.out.println("set studentId call");
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID && Objects.equals(studentName, student.studentName) && Objects.equals(studentAddress, student.studentAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, studentName, studentAddress);
    }

    public Student() {
        super();
    }

    public void setStudentName(String studentName) {
        System.out.println("set studentName call");
        this.studentName = studentName;
    }


    public Student(int studentID, String studentName, String studentAddress) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        System.out.println("set studentAddress call");
        this.studentAddress = studentAddress;
    }

}
