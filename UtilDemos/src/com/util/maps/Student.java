package com.util.maps;

public class Student {
    private String stuName;
    private String city;

    public Student(){}

    public Student(String stuName, String city) {
        this.stuName = stuName;
        this.city = city;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
