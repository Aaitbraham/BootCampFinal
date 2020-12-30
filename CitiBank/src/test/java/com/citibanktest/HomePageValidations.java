package com.citibanktest;

import com.citibank.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class HomePageValidations extends TestBase {

    @Test(enabled = false)
    public void userBeingAbleToMouseHoverCreditCards(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.mouseHoverCreditCards();
    }


    @Test(enabled = false)
    public void userBeingAbleToClickOnSearch(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.searchTab();

    }
    @Test(enabled = false)
    public void userBeingAbleToClickOnGoodPLay(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnGPlay();

    }

    @Test(enabled = false)
    public void userNotBeingAbleToSignInWithInvalidCredentials() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignOnAndEnterCredentials();
    }

    @Test(enabled = false)
    public void userBeingAbleToClickOnMortgageDeals() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnMortgageDeals();
    }
    @Test(enabled = false)
    public void userBeingAbleToClickOnCareersTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnCareersTab();
    }

    @Test(enabled = false)
    public void userBeingAbleToClickLinkedinTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickMatchJobsWithLinkedinTab();
    }

}
