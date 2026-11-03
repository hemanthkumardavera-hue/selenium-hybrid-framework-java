package com.qa.api.tests;

import org.testng.annotations.Test;

import com.qa.api.models.User;
import com.qa.api.models.UsersResponse;

import static io.restassured.RestAssured.*;

public class UsersListTest {

    @Test
    public void verifyUsers() {

        UsersResponse response =

                given()

                .when()

                .get("https://reqres.in/api/users?page=2")

                .then()

                .statusCode(200)

                .extract()

                .as(UsersResponse.class);

        for (User user : response.getData()) {

            System.out.println(
                    user.getId() + " "
                    + user.getEmail());
        }
    }
}