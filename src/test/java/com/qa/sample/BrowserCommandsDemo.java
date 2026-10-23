package com.qa.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommandsDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("Title : " + driver.getTitle());

        System.out.println("URL : " + driver.getCurrentUrl());

        driver.quit();
    }
}