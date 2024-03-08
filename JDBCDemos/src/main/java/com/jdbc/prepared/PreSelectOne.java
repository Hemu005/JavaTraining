package com.jdbc.prepared;

import java.sql.*;
import java.time.LocalTime;

public class PreSelectOne {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql = "select * from cab where pickup_loc=?";
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setString(1, " rajajinagar");
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    int cabNumber = resultSet.getInt("cab_number");
                    String dropLoc = resultSet.getString("drop_loc");
                    String pickupLoc = resultSet.getString("pickup_loc");
                    String pickupDate = resultSet.getString("pickup_date").toString();
                    Time time = resultSet.getTime("pickup_time");
                    LocalTime pickupTime = LocalTime.parse(time.toString());
                    String driverName = resultSet.getString("driver_name");
                    System.out.println(cabNumber + "\t" + dropLoc + "\t" + pickupLoc + "\t" + pickupDate + "\t" + time + "\t" +
                            pickupTime + "\t" + driverName);
                }
                statement.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}