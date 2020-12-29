package com.amazon.pages;

import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;

public class HomePage extends TestBase {

    @FindBy(id="twotabsearchtextbox")
    private WebElement searchBar;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class='s-desktop-width-max s-desktop-content sg-row']")
    private WebElement searchResultDisplayed;


    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    private WebElement signIn;

    @FindBy(id = "searchDropdownBox")
    private WebElement dropdown;

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    private WebElement mouseHoverSignInAccount;

    @FindBy(xpath = "//div[@id='nav-al-signin']")
    private WebElement signInDisplayed;

    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    private WebElement amazonPageRefresh;

    @FindBy(xpath = "//a[text()='Customer Service']")
    private WebElement customerServiceButton;

    @FindBy(xpath = "//div[@class='a-section a-spacing-extra-large a-spacing-top-extra-large ss-landing-container']/h1")
    private WebElement helpOptionsDisplayed;

    @FindBy(xpath = "//a[text()='Whole Foods']")
    private WebElement wholeFoodTab;

    @FindBy(xpath = "//img[@class='nav-categ-image']")
    private WebElement WholeFoodRefreshTab;


    public void typeOnSearchbar(){
        searchBar.isDisplayed();
        searchBar.sendKeys("Iphone");
        ExtentTestManager.log("<<<<<<<Iphones have been Typed>>>>>>>");
    }

    public void clickOnSearchBtn(){
        searchBar.sendKeys("Iphones");
        searchButton.click();
        Assert.assertTrue(searchResultDisplayed.isDisplayed());


    }

    public void clickOnDropDown(){
        selectInList(dropdown).selectByValue("search-alias=amazon-devices");
        sleepFor(2);
        Assert.assertTrue(dropdown.getText().contains("Amazon Devices"));
        sleepFor(2);
    }

    public void mouseHoverSignIn(){
        mouseHover(mouseHoverSignInAccount);

        Assert.assertTrue(signInDisplayed.isDisplayed());

        signIn.click();

    }

    public void refreshAmazonPage(){
        amazonPageRefresh.click();
        Assert.assertTrue(amazonPageRefresh.isDisplayed());

    }

    public void clickOnCustomerServiceButton() {
        customerServiceButton.click();
        Assert.assertTrue(helpOptionsDisplayed.isDisplayed());
    }

    public void clickOnWholeFoodTab() {
        wholeFoodTab.click();
        Assert.assertTrue(WholeFoodRefreshTab.isDisplayed());
    }










    }
