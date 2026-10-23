package com.qa.utilities;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name="loginData")
    public Object[][] loginData() {

        return ExcelUtil.getLoginData();

    }
}
