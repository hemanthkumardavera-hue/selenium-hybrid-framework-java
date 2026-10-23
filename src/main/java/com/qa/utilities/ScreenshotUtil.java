package com.qa.utilities;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {

	public static String captureScreenshot(
	        WebDriver driver,
	        String fileName) {

		String path =
				"./screenshots/"
				+ fileName
				+ "_"
				+ System.currentTimeMillis()
				+ ".png";

	    try {

	        File src =
	            ((TakesScreenshot)driver)
	            .getScreenshotAs(
	                OutputType.FILE);

	        File dest =
	            new File(path);

	        FileHandler.copy(
	            src,
	            dest);

	    } catch(Exception e) {

	        e.printStackTrace();

	    }

	    return path;
	}

}