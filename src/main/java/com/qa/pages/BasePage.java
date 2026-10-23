package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.utilities.WaitUtil;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
    }

    protected void enterText(
            By locator,
            String text)
    {
        WaitUtil.waitForVisibility(
                driver,
                locator)
                .clear();

        WaitUtil.waitForVisibility(
                driver,
                locator)
                .sendKeys(text);
    }

    protected void click(
            By locator)
    {
        WaitUtil.waitForClickable(
                driver,
                locator)
                .click();
    }

    protected boolean isElementDisplayed(
            By locator)
    {
        return WaitUtil
                .waitForVisibility(
                driver,
                locator)
                .isDisplayed();
    }
}