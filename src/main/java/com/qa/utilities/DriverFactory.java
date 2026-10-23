package com.qa.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

    public static WebDriver createDriver(String browser) {

        WebDriver driver = null;

        switch (browser.toLowerCase()) {

        case "chrome":
            driver = new ChromeDriver();
            break;

        case "edge":
        	EdgeOptions options = new EdgeOptions();

        	options.addArguments("--remote-allow-origins=*");

        	driver = new EdgeDriver(options);
            break;

        case "firefox":
        	FirefoxOptions options1 = new FirefoxOptions();

        	options1.addArguments("-private");

        	driver = new FirefoxDriver(options1);
            break;

        default:
            throw new RuntimeException(
                    "Invalid Browser : " + browser);
        }

        return driver;
    }
}