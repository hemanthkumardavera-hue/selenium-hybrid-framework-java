package com.qa.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.api.models.UserRequest;
import com.qa.api.models.UserResponse;
import com.qa.api.specs.ResponseSpecs;

import static io.restassured.RestAssured.*;

public class SerializationTest {

    @Test
    public void verifySerializationAndDeserialization() {

        UserRequest request =
                new UserRequest();

        request.setName("Hemanth");
        request.setJob("QA Engineer");

        UserResponse response =

                given()

                .contentType("application/json")

                .body(request)

                .when()

                .post("https://reqres.in/api/users")

                .then()
                .spec(ResponseSpecs.success201())

                .extract()

                .as(UserResponse.class);

        System.out.println(
                response.getId());

        Assert.assertEquals(
                response.getName(),
                "Hemanth");

        Assert.assertEquals(
                response.getJob(),
                "QA Engineer");
        System.out.println(
                response.getSupport().getUrl());

        System.out.println(
                response.getSupport().getText());
    }
}