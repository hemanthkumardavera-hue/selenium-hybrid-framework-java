package com.qa.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports extent;

    public static ExtentReports getInstance() {

        if(extent == null) {

            //ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
            ExtentSparkReporter spark =
            		new ExtentSparkReporter(
            		"reports/ExtentReport.html");

            spark.config().setReportName(
                "Automation Test Report"
            );

            spark.config().setDocumentTitle(
                "QA Automation Results"
            );

            extent = new ExtentReports();

            extent.attachReporter(spark);
        }

        return extent;
    }
}