package com.qa.utilities;

import org.testng.Assert;

public class ValidationUtil {

    public static void verifyTrue(
            boolean condition,
            String message) {

        Assert.assertTrue(
                condition,
                message);
    }

    public static void verifyEquals(
            String actual,
            String expected,
            String message) {

        Assert.assertEquals(
                actual,
                expected,
                message);
    }
}