package com.qa.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

    public static void main(String[] args) {

        WebDriver driver =
            new ChromeDriver();

        driver.get("https://www.amazon.in");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement menu =
            driver.findElement(
            By.id("nav-link-accountList"));

        Actions actions =
            new Actions(driver);

        actions.moveToElement(menu)
               .perform();

        driver.quit();
    }
}