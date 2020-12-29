package com.cnntest;

import com.cnn.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class HomePageValidations extends TestBase {

    @Test(enabled = false)
    public void userBeingAbleToClickOnUsNewsPage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnWorldTab();
    }

    @Test(enabled = false)
    public void userBeingAbleToClickOnLiveTv() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnLiveTV();
    }

    @Test(enabled = false)
    public void userBeingAbleToClickAfricaTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnAfricaTab();
    }

    @Test(enabled = false)
    public void userBeingAbleToClickOnUserTAb() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnUserIcon();
    }

    @Test(enabled = false)
    public void userNotBeingAbleToLoginWithOutRegisteringToCnn() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnUserIcon();
        homePage.loginToCnn();
        homePage.pwdTab();
        homePage.loginBtn();
    }

    @Test(enabled = false)
    public void userBeingAbleToClickOnCnnMenu() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.menuTab();
    }

    @Test(enabled = false)
    public void userBeingAbleToClickOnSearchButtonAndNavigate() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.searchBtn();
    }

    @Test
    public void userBeingAbleToscrolldown() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollDown();
    }
}