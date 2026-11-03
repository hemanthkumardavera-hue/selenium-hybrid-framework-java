package com.qa.api.utils;

import org.testng.Assert;

public class APIAssertions {

    public static void verifyToken(
            String token) {

        Assert.assertNotNull(token);
    }

    public static void verifyValue(
            String actual,
            String expected) {

        Assert.assertEquals(
                actual,
                expected);
    }
}