package com.qa.api.base;

import io.restassured.RestAssured;

public class BaseAPI {

    static {

        RestAssured.baseURI =
                "https://reqres.in/api";
    }
}