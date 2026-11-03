package com.qa.api.utils;

import io.restassured.response.Response;

public class APIUtils {

    public static String getStringValue(
            Response response,
            String path) {

        return response
                .jsonPath()
                .getString(path);
    }

    public static int getIntValue(
            Response response,
            String path) {

        return response
                .jsonPath()
                .getInt(path);
    }

    public static boolean getBooleanValue(
            Response response,
            String path) {

        return response
                .jsonPath()
                .getBoolean(path);
    }
}