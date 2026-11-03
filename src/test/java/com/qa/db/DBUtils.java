package com.qa.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {

    private static final String URL =
            "jdbc:mysql://localhost:3306/automationdb";

    private static final String USERNAME =
            "root";

    private static final String PASSWORD =
            "Hello@bittu1";   // use your actual password

    public static Connection getConnection()
            throws Exception {

        return DriverManager.getConnection(
                URL,
                USERNAME,
                PASSWORD);
    }
}
