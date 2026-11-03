package com.qa.api.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecs {

    public static ResponseSpecification success200() {

        return new ResponseSpecBuilder()

                .expectStatusCode(200)

                .build();
    }

    public static ResponseSpecification success201() {

        return new ResponseSpecBuilder()

                .expectStatusCode(201)

                .build();
    }

    public static ResponseSpecification success204() {

        return new ResponseSpecBuilder()

                .expectStatusCode(204)

                .build();
    }
}