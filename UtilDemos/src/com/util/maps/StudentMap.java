package com.util.maps;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        Map<Department, List<Student>> hashMap=new HashMap<>();
        Department department1=new Department("King",01,"Cs");
        Department department2=new Department("Peter",01,"EEE");
        Department department3=new Department("Cook",01,"Civil");

        hashMap.put(department1, Arrays.asList(
                new Student("Hemu","Mandya"),
                new Student("Kushu","KGF"),
                new Student("Nithi","Andra")));
        hashMap.put(department2,Arrays.asList(
                new Student("Basava","Manglore"),
                new Student("Priya","Davanagere"),
                new Student("Anu","Shivamogga")));
        hashMap.put(department3,Arrays.asList(
                new Student("Vinu","Malavalli"),
                new Student("Adarsh","Hasan"),
                new Student("Harshith","Mandya")));

        Set<Department> departments=hashMap.keySet();
        for (Department department:departments){
            System.out.println(department.getDeptHead()+" "+department.getDeptName());
            //department is key
            List<Student> students=hashMap.get(department);
            for (Student student:students){
                System.out.println(student.getStuName());
            }
        }

    }
}
