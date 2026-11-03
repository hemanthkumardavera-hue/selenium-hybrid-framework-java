package com.qa.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
    @Test
    public void verifySpecificUser()
            throws Exception {

        Connection connection =
                DBUtils.getConnection();

        PreparedStatement statement =
                connection.prepareStatement(
                        "SELECT * FROM users WHERE id = ?");

        statement.setInt(1, 101);

        ResultSet rs =
                statement.executeQuery();

        Assert.assertTrue(rs.next());

        String userName =
                rs.getString("username");

        Assert.assertEquals(
                userName,
                "Hemanth");

        connection.close();
    }
    
    @Test
    public void verifyUserInDB()
            throws Exception {

        String username =
                DBUtils.getUserName(101);

        Assert.assertEquals(
                username,
                "Hemanth");
    }
}