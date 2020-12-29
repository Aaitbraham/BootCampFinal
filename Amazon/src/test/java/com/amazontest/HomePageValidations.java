package com.amazontest;

import com.amazon.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class HomePageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserBeingAbleToTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchbar();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnSearchButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearchBtn();
    }

    @Test(enabled = false)
    public void userBeingAbleToSelectFromDropDown() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnDropDown();
    }

    @Test(enabled = false)
    public void userBeingAbleToMouseHoverSignInAccount() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.mouseHoverSignIn();
    }

    @Test(enabled = false)
    public void userBeingAbleToRefreshAmazonHomepage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.refreshAmazonPage();
    }
    @Test(enabled = false)
    public void validateUSerBeenAbleToClickOnCustomerServiceButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnCustomerServiceButton();

    }

    @Test(enabled = false)
    public void validateUSerBeenAbleToClickOnWholeFoodTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnWholeFoodTab();
    }



}
