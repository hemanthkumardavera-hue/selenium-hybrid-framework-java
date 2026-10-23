package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utilities.ValidationUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogoutTest extends BaseTest {
	
    private static final Logger logger =
            LogManager.getLogger(LogoutTest.class);

	@Test(
			groups = {"smoke", "regression"}
		)
    public void verifyLogout() {

        LoginPage loginPage =
                new LoginPage(
                        getDriver());

        HomePage homePage =
                loginPage.login(
                        "tomsmith",
                        "SuperSecretPassword!"
                );

        ValidationUtil.verifyTrue(

                homePage.isLogoutDisplayed(),

                "Logout button should be visible"

        );

        LoginPage logoutPage =
                homePage.logout();

        ValidationUtil.verifyTrue(

                logoutPage.isLoginPageDisplayed(),

                "Login page should be displayed after logout"

        );
    }
}
