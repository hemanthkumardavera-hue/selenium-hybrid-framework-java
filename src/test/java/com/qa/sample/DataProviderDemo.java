package com.qa.sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return new Object[][] {

            {"Hemanth", "pass123"},

            {"Admin", "admin123"},

            {"Test", "test123"}

        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest( 
            String username,
            String password) {

      	System.out.println(
    		    "Username: " + username
    		);

    		System.out.println(
    		    "Password: " + password
    		);

    		System.out.println(
    		    "==============="
    		);
    }
}