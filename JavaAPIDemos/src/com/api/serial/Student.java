package com.api.serial;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID=3L;
    private String studentName;
    private int studentId;
    private String department;

    public Student(){

    }

    public Student(String studentName, int studentId, String department) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.department = department;
    }

    public String getStudentName() {

        return studentName;
    }

    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }

    public int getStudentId() {

        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                ", department='" + department + '\'' +
                '}';
    }
}
