package com.qa.api.specs;

import com.qa.api.auth.AuthTokenManager;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecs {

	public static RequestSpecification
	getAuthenticatedRequestSpec() {

	    return new RequestSpecBuilder()

	        .setContentType("application/json")

	        .addHeader(
	            "Authorization",
	            "Bearer "
	              + AuthTokenManager.getToken())

	        .build();
	

    }
}