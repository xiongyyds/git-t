package com.hebau.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springboot",
                    "root","8888");
            System.out.println(connection);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
