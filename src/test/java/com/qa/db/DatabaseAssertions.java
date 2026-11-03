package com.qa.db;

import org.testng.Assert;

public class DatabaseAssertions {

    public static void verifyUsername(
            String actual,
            String expected) {

        Assert.assertEquals(
                actual,
                expected);
    }
}