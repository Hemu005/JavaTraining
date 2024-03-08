package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        //get the connection object
        try(Connection connection= DriverManager.getConnection(url,username,password);
            //create a statement object
            Statement statement = connection.createStatement();){
            //the sql query to be executed
            String sql =
                    "select * from employee";
            //pass the sql query inside execute method
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                String name=resultSet.getString("name");
                int employeeId=resultSet.getInt("employeeId");
                String city=resultSet.getString("city");
                System.out.println(name+"\t"+employeeId+"\t"+city);
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
