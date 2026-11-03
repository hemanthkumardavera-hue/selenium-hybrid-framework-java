package com.qa.api.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.qa.utilities.ExtentManager;
import com.qa.utilities.ExtentTestManager;

public class APIBaseTest {

    protected static ExtentReports extent;

    @BeforeMethod

    public void setupReport() {

        extent =
            ExtentManager.getInstance();

        ExtentTest test =

            extent.createTest(
                getClass()
                    .getSimpleName());

        ExtentTestManager
            .setTest(test);
    }

    @AfterMethod

    public void flushReport() {

        extent.flush();

        ExtentTestManager.unload();
    }
}