package com.qa.api.tests;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TokenTest {

    @Test
    public void generateToken() {

        String payload =
                """
                {
                  "email": "eve.holt@reqres.in",
                  "password": "cityslicka"
                }
                """;

        Response response =

                given()

                .contentType("application/json")
                .body(payload)

                .when()

                .post(
                  "https://reqres.in/api/login")

                .then()

                .statusCode(200)

                .extract()

                .response();

        String token =

                response.jsonPath()
                        .getString("token");

        System.out.println(
                "Token : " + token);
    }
}