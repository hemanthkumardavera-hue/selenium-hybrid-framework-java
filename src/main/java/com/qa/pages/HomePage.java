package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePage extends BasePage {

    private static final Logger logger =
            LogManager.getLogger(HomePage.class);

    public HomePage(WebDriver driver) {

        super(driver);
    }

    By logoutButton =
            By.cssSelector(
                    "a.button.secondary.radius");

    public boolean isLogoutDisplayed() {

        logger.info(
                "Verifying Logout Button Visibility");

        return isElementDisplayed(
                logoutButton);
    }

    public LoginPage logout() {

        logger.info(
                "Clicking Logout Button");

        click(
                logoutButton);

        logger.info(
                "Logout Successful");

        return new LoginPage(driver);
    }
}