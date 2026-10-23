package com.qa.sample;

/*import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username"))
              .sendKeys("tomsmith");

        driver.findElement(By.id("password"))
              .sendKeys("SuperSecretPassword!");

        driver.findElement(By.cssSelector("button"))
              .click();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.contains("secure")) {

            System.out.println("Login Passed");

        } else {

            System.out.println("Login Failed");
        }

        driver.quit();
    }
} */

import org.testng.annotations.*;

public class LoginTest1 {

    @BeforeMethod
    public void setup() {

        System.out.println("Launch Browser");
    }

    @Test
    public void loginTest() {

        System.out.println("Execute Login Test");
    }

    @AfterMethod
    public void teardown() {

        System.out.println("Close Browser");
    }
}
