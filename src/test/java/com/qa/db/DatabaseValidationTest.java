package com.qa.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DatabaseValidationTest {

    @Test
    public void verifyUserData()
            throws Exception {

        Connection connection =
                DBUtils.getConnection();

        Statement statement =
                connection.createStatement();

        ResultSet resultSet =
                statement.executeQuery(
                        "SELECT * FROM users");

        while(resultSet.next()) {

            System.out.println(
                    resultSet.getInt("id")
                    + " "
                    + resultSet.getString("username")
                    + " "
                    + resultSet.getString("email"));
        }

        connection.close();
    }
}