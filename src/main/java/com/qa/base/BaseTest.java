package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.qa.utilities.ConfigReader;
import com.qa.utilities.DriverFactory;
import com.qa.utilities.DriverManager;

public class BaseTest {
	
	private static final Logger logger =
	        LogManager.getLogger(BaseTest.class);


    protected ConfigReader config;

    @BeforeMethod(alwaysRun = true)
    @Parameters("browser")
    public void setUp(
            @Optional("chrome") String browser) {

        config = new ConfigReader();

        // Priority:
        // 1. Jenkins/Maven System Property
        // 2. TestNG Parameter
        logger.info("********** SETUP STARTED **********");
        String browserName =
                System.getProperty(
                        "browser",
                        browser);

        logger.info(
                "Launching Browser : {}",
                browserName);

        WebDriver driver =
                DriverFactory.createDriver(
                        browserName);
        logger.info("Driver Created = {}", driver);

        DriverManager.setDriver(driver);
        
        logger.info(
                "DriverManager Value = {}",
                DriverManager.getDriver());

        DriverManager.getDriver()
                     .manage()
                     .window()
                     .maximize();

        DriverManager.getDriver()
                     .get(
                       config.getProperty("url"));

        logger.info(
                "Current URL : {}",
                DriverManager.getDriver()
                             .getCurrentUrl());

        logger.info(
                "Thread ID : {}",
                Thread.currentThread()
                      .getId());

        logger.info(
                "Browser : {}",
                browserName);
        logger.info(
                "Browser Parameter Received : {}",
                browser);
        logger.info(
                "System Browser : {}",
                System.getProperty("browser"));
        logger.info(
                "Driver Created : {}",
                driver);
        
        
    }
    
    public WebDriver getDriver() {

        return DriverManager.getDriver();
    }

    @AfterMethod
    public void tearDown() {

        if (DriverManager.getDriver() != null) {

            DriverManager.getDriver().quit();

            DriverManager.unload();
        }
    }
}