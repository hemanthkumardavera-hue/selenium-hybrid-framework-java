package com.qa.api.auth;

public class AuthTokenManager {

    private static String token;

    public static void setToken(String authToken) {

        token = authToken;
    }

    public static String getToken() {

        return token;
    }
}