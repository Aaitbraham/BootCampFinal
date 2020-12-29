package com.amazontest;

import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class LoginPageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserBeingAbleToTypeInEmailAddress() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.mouseHoverSignIn();
        loginPage.TypeInEmailAddress();

    }
    @Test(enabled = false)
    public void validateUserBeingAbleToClickContinueButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.mouseHoverSignIn();
        loginPage.TypeInEmailAddress();
        sleepFor(3);
        loginPage.ClickContinueButton();
    }


    @Test(enabled = false)
    public void validateUserBeingAbleToTypePassword() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        homePage.mouseHoverSignIn();

        loginPage.TypeInEmailAddress();
        sleepFor(3);

        loginPage.typeInPasswordTab();
        sleepFor(3);

        loginPage.clickOnSignInButton();
    }

    @Test(enabled = false)
    public void validateUserNotBeingAbleToLoginWithInvalidPassword() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
       homePage.mouseHoverSignIn();
        loginPage.TypeInEmailAddress();
        sleepFor(3);

        loginPage.typeInPasswordTab();
        loginPage.clickOnSignInButton();
    }
}
