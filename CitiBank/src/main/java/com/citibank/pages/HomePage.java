package com.citibank.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;

public class HomePage extends TestBase {

    @FindBy(xpath = "//a[@id='creditcards']")
    private WebElement creditCardsTab;

    @FindBy(xpath = "//a[@id='viewAllCards_Link']")
    private WebElement viewAllCreditcards;

    @FindBy(xpath = "//input[@id='username']")
    private WebElement userNameTab;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordTab;

    @FindBy(xpath = "//a[@class='signOnBtn']") //1
    private WebElement signOnTab;

    @FindBy(xpath = "(//a[@id='newSearchNav'])[1]")
    private WebElement searchBtn;

    @FindBy(xpath = "//input[@id='citi-autocomplete-content-searchbox-livesearch']")
    private WebElement searchBar;

    @FindBy(xpath = "//a[@id='PlayStoreBadge']")
    private WebElement googlePlay;

    @FindBy(xpath = "//input[@id='signInBtn']") //2
    private WebElement signOn;

    @FindBy(xpath = "//label[@id='rememberUidLabel']")
    private WebElement rememberMyUserId;

    @FindBy(xpath = "(//a[@class='hoverHeader'])[3]")
    private WebElement mortgageDeals;

    @FindBy(xpath = "(//a[@class='hoverHeader'])[1]")
    private WebElement bankYourOwnWay;

    @FindBy(xpath = "//div[@id='whyCitiPadding']/ul//a[@href='https://jobs.citi.com/']")
    private WebElement careerTab;

    @FindBy(xpath = "//input[@class='search-keyword']")
    private WebElement keywordSearchBar;

    @FindBy(xpath = "//span[@class='callout__text']")
    private WebElement matchJobsWithLinkedinTab;

    @FindBy(xpath = "//main[@class='app__content ']")
    private WebElement linkedinSignInPage;


    public void clickOnBankingYourOwn() {
        bankYourOwnWay.click();
    }


    public void clickOnMortgageDeals() {
        mortgageDeals.click();

    }

    public void mouseHoverCreditCards() {

        mouseHover(creditCardsTab);
        sleepFor(2);
        viewAllCreditcards.click();

    }

    public void searchTab() {
        searchBtn.click();
        searchBar.sendKeys("test");
        sleepFor(3);

        Assert.assertTrue(searchBar.isDisplayed());
    }

    public void clickOnGPlay() {
        googlePlay.click();
        Assert.assertTrue(googlePlay.isDisplayed());
    }

    public void clickOnSignOnAndEnterCredentials() {
//        signOnTab.click();
//        sleepFor(3);
        //Assert.assertTrue(userNameTab.isDisplayed());
        userNameTab.sendKeys("adel");
        sleepFor(3);
        passwordTab.sendKeys("ALl51234");
        sleepFor(3);
        rememberMyUserId.click();
        sleepFor(5);
        signOn.click();


    }

    public void clickOnCareersTab() {
        careerTab.click();
        sleepFor(3);
        keywordSearchBar.sendKeys("tester");
        sleepFor(5);
//Assert.assertTrue(keywordSearchBar.isDisplayed());
    }

    public void clickMatchJobsWithLinkedinTab(){
        careerTab.click();
        sleepFor(3);

        matchJobsWithLinkedinTab.click();
        sleepFor(3);
        Assert.assertTrue(linkedinSignInPage.isDisplayed());

    }

}