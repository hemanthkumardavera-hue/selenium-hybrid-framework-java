package com.qa.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait =
            new WebDriverWait(driver,
            Duration.ofSeconds(10));

        driver.get(
            "https://the-internet.herokuapp.com/login"
        );

        WebElement username =
            wait.until(
            ExpectedConditions
            .visibilityOfElementLocated(
            By.id("username")));

        username.sendKeys("tomsmith");

        driver.findElement(
            By.id("password"))
            .sendKeys("SuperSecretPassword!");

        driver.findElement(
            By.cssSelector("button"))
            .click();

        System.out.println("Login Completed");

        driver.quit();
    }
}