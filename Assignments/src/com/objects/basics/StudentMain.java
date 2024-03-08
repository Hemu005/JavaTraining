package com.objects.basics;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        for(int j=0;j<2;j++){
        System.out.println("Enter the Student Name :");
        String name = sc.next();
        System.out.println("Enter the Department :");
        String department = sc.next();
        System.out.println("Enter the number of subjects:");
        int subjects = sc.nextInt();
        System.out.println("Enter the each subject marks:");
        int[] marks=new int[subjects];
        for (int i=0;i<subjects;i++){
            marks[i]=sc.nextInt();
        }

        Student student = new Student(name,department);
        student.printDetails();
        System.out.println("Grade :"+student.getGrades(marks));
    }}
}
