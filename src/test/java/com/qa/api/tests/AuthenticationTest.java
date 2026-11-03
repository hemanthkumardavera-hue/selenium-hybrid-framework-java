package com.qa.api.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.api.auth.AuthTokenManager;
import com.qa.api.base.APIBaseTest;
import com.qa.api.models.LoginRequest;
import com.qa.api.models.LoginResponse;
import com.qa.utilities.ExtentTestManager;

import static io.restassured.RestAssured.*;

public class AuthenticationTest
extends APIBaseTest {

	private static final Logger logger =
	        LogManager.getLogger(
	                AuthenticationTest.class);
    @Test
    public void generateToken() {
   
    	logger.info(
    	        "Authentication started");

    	ExtentTestManager
    	        .getTest()
    	        .info(
    	            "Authentication started");

        LoginRequest request =
                new LoginRequest();

        ExtentTestManager
        .getTest()
        .info(
           "Generating Authentication Token");
        
        request.setEmail(
                "eve.holt@reqres.in");

        request.setPassword(
                "cityslicka");

        logger.info(
                "Calling Login API");

        ExtentTestManager
                .getTest()
                .info(
                    "Calling Login API");
        
        LoginResponse response =

                given()

                .contentType("application/json")

                .body(request)

                .when()

                .post(
                  "https://reqres.in/api/login")

                .then()

                .statusCode(200)

                .extract()

                .as(LoginResponse.class);

        AuthTokenManager.setToken(
                response.getToken());
        
        logger.info(
                "Token Generated : {}",
                response.getToken());

        ExtentTestManager
                .getTest()
                .pass(
                    "Token Generated Successfully");
        
      
        
        System.out.println(
              "Token = "
              + response.getToken());

        Assert.assertNotNull(
                response.getToken());

        logger.info(
                "Authentication Successful");

        ExtentTestManager
                .getTest()
                .pass(
                    "Authentication Successful");
        
        
    }
}