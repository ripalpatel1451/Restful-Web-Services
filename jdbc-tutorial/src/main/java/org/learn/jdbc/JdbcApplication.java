package org.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.sql.DriverManager.*;

public class JdbcApplication
{
    static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/test_database";
    static final String USER_NAME = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try {
            Connection connection = getConnection(URL, USER_NAME,PASSWORD);
            System.out.println("Database connection established : " + connection.isClosed());


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
