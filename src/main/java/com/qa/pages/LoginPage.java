package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPage extends BasePage {

    private static final Logger logger =
            LogManager.getLogger(LoginPage.class);

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By username =
            By.id("username");

    By password =
            By.id("password");

    By loginBtn =
            By.cssSelector("button");

    By successMessage =
            By.cssSelector(".flash.success");

    By errorMessage =
            By.cssSelector(".flash.error");

    By loginButton =
            By.cssSelector("button");

    public HomePage login(
            String user,
            String pass) {

        logger.info("Entering Username");

        enterText(
                username,
                user);

        logger.info("Entering Password");

        enterText(
                password,
                pass);

        logger.info("Clicking Login Button");

        click(
                loginBtn);

        logger.info("Login Request Submitted");

        return new HomePage(driver);
    }

    public String getCurrentUrl() {

        return driver.getCurrentUrl();
    }

    public boolean isLoginSuccessful() {

        logger.info(
                "Verifying Successful Login");

        return isElementDisplayed(
                successMessage);
    }

    public boolean isLoginFailed() {

        logger.info(
                "Verifying Failed Login");

        return isElementDisplayed(
                errorMessage);
    }

    public boolean isLoginPageDisplayed() {

        logger.info(
                "Verifying Login Page Visibility");

        return isElementDisplayed(
                loginButton);
    }
}