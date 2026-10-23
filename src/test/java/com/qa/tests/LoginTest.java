package com.qa.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utilities.Constants;
import com.qa.utilities.TestData;
import com.qa.utilities.ValidationUtil;

@Listeners(com.qa.utilities.TestListener.class)
public class LoginTest extends BaseTest {

    private static final Logger logger =
            LogManager.getLogger(LoginTest.class);

    @Test(
            groups = {"smoke", "regression"},
            dataProvider = "loginData",
            dataProviderClass = TestData.class
    )
    public void loginTest(
            String username,
            String password,
            String expected) {

        logger.info(
                "Executing Test For : {}",
                username);

        LoginPage loginPage =
                new LoginPage(getDriver());
        
        logger.info(
                "Driver In Test = {}",
                getDriver());

        HomePage homePage =
                loginPage.login(
                        username,
                        password);

        if(expected.equalsIgnoreCase(
                Constants.PASS)) {

            logger.info(
                    "Validating successful login");

            ValidationUtil.verifyTrue(
                    homePage.isLogoutDisplayed(),
                    "Logout button should be visible after successful login");

        } else {

            logger.info(
                    "Validating failed login");

            ValidationUtil.verifyTrue(
                    loginPage.isLoginFailed(),
                    "Error message should appear for invalid login");
        }
    }
}
