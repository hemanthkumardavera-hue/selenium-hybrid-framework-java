package com.qa.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtils extends DBConstants {

    /*private static final String URL =
            "jdbc:mysql://localhost:3306/automationdb";

    private static final String USERNAME =
            "root";

    private static final String PASSWORD =
            "Hello@bittu1";   // use your actual password*/

    public static Connection getConnection()
            throws Exception {

        return DriverManager.getConnection(
                URL,
                USERNAME,
                PASSWORD);
    }
    
    public static String getUserName(
            int id) throws Exception {

        Connection con =
                getConnection();

        PreparedStatement ps =
                con.prepareStatement(
                    "SELECT username FROM users WHERE id=?");

        ps.setInt(1, id);

        ResultSet rs =
                ps.executeQuery();

        rs.next();

        return rs.getString("username");
    }
}
