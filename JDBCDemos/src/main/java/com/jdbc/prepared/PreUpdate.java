package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql="Update cab set driver_name=? where cab_number=?";
        try(Connection connection= DriverManager.getConnection(url,username,password);
            PreparedStatement statement = connection.prepareStatement(sql);
            Scanner sc =new Scanner(System.in);
        ){
            System.out.println("Enter the driver name");
            String driverName=sc.next();
            System.out.println("Enter the cab number");
          int cabNumber= sc.nextInt();

          //assign values  to palceholders
            statement.setString(1,driverName);
            statement.setInt(2,cabNumber);
            boolean result=statement.execute();
                System.out.println(result);

        } catch (SQLException e) {
            throw new RuntimeException(e);

}
    }
}