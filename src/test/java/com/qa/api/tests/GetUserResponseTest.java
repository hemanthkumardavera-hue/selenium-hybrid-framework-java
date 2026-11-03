package com.qa.api.tests;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetUserResponseTest {

    @Test
    public void verifyUserResponse() {

        Response response =

                given()

                .when()

                .get("https://reqres.in/api/users/2")

                .then()

                .statusCode(200)

                .extract()

                .response();

        String firstName =
                response.jsonPath()
                        .getString("data.first_name");

        System.out.println(firstName);
    }
}