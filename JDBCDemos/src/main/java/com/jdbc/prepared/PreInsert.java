package com.jdbc.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreInsert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql="insert into cab values(?,?,?,?,?,?)";
        try(Connection connection= DriverManager.getConnection(url,username,password);
            PreparedStatement statement = connection.prepareStatement(sql);){
            Scanner sc =new Scanner(System.in);
            for(int i=0;i<5;i++){
                System.out.println("Enter cab number:");
                int cabNumber=sc.nextInt();
                System.out.println("Enter drop location:");
                String dropLoc=sc.next();
                System.out.println("Enter pickup location:");
                String pickupLoc=sc.next();
                System.out.println("Enter pickup time:");
                String pickupTime=sc.next();
                System.out.println("Enter pickup date");
                String pickupDate =sc.next();
               System.out.println("Enter driver name");
                String driverName=sc.next();


                //assign values to placeholders
                statement.setInt(1,cabNumber);
                statement.setString(2,dropLoc);
                statement.setString(3,pickupLoc);
                statement.setTime(4, Time.valueOf(pickupTime));
                statement.setDate(5,Date.valueOf(pickupDate));
                statement.setString(6,driverName);

                statement.execute();
            }
            boolean result=statement.execute();
            System.out.println(!result);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
