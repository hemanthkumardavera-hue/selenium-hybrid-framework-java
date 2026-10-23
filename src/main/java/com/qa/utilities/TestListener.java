package com.qa.utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.*;

public class TestListener
implements ITestListener {

    ExtentReports extent =
        ExtentManager.getInstance();

    private static ThreadLocal<ExtentTest>
    test =
    new ThreadLocal<>();

    @Override
    public void onTestStart(
            ITestResult result) {

    	test.set(

    		    extent.createTest(
    		        result.getMethod()
    		              .getMethodName()
    		    )

    		);
    }


    @Override
    public void onTestSuccess(
            ITestResult result) {

    	test.get().pass(
    		    "Execution completed successfully"
    		);
    }

    @Override
    public void onTestFailure(
            ITestResult result) {

        String screenshotPath =
            ScreenshotUtil.captureScreenshot(

                DriverManager.getDriver(),

                result.getName()

            );

        test.get().fail(
        	    result.getThrowable()
        	);

        try {

        	test.get()
            .addScreenCaptureFromPath(
                screenshotPath
            );
        } catch(Exception e) {

            e.printStackTrace();
        }
    } 
    
    @Override
    public void onTestSkipped(
            ITestResult result) {

        test.get().skip(
                "Test Skipped"
        );
    }
    @Override
    public void onFinish(
            org.testng.ITestContext context) {

        extent.flush();
    }
}