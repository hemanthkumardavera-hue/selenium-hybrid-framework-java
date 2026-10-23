package com.qa.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(
            By.xpath("//input[@id='username']")
        ).sendKeys("tomsmith");

        driver.findElement(
            By.xpath("//input[@id='password']")
        ).sendKeys("SuperSecretPassword!");

        driver.findElement(
            By.xpath("//button[@type='submit']")
        ).click();

        String url = driver.getCurrentUrl();

        if(url.contains("secure")) {

            System.out.println("Login Passed");

        } else {

            System.out.println("Login Failed");

        }

        driver.quit();
    }
}