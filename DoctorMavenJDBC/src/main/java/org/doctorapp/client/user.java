package org.doctorapp.client;

import org.doctorapp.Exception.DoctorNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialization;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class user {
    public static void main(String[] args) throws DoctorNotFoundException, SQLException {
        Scanner sc=new Scanner(System.in);

        System.out.println("1.Get all Doctor list "+
                           "2.Speciality "+
                           "3.Speciality and experience "+
                           "4.Speciality and fees "+
                           "5.Speciality and ratings "+
                           "6.Speciality and name");

        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        IDoctorService doctorService=new DoctorServiceImpl();
        switch (choice){
            case 1:
                System.out.println("List of doctors");
               List <Doctor> doctor=doctorService.getAll();
               for (Doctor doctor1:doctor)
                System.out.println(doctor);
               break;
            case 2:
                System.out.println("Enter specialist:");
                String spl=sc.next();
                Specialization sp= new Specialization(spl);
                List<Doctor> doctorList=doctorService.getBySpeciality(String.valueOf(sp));
                for (Doctor doctor1:doctorList)
                    System.out.println(doctor1);
                break;
            case 3:
                System.out.println("Enter specialist and fees less than");
                String spl1=sc.next();
                double fees=sc.nextDouble();
                Specialization sp1.
                List<Doctor> doctorList1=doctorService.getBySpecialityAndLessFees()
        }
    }
}
