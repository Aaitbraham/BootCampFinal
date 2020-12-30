package com.facebook.pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;

public class HomePage extends TestBase {

    @FindBy(xpath ="(//a[@name='world'])[1]")
    private WebElement worldTab;

    @FindBy(xpath = "(//span[@class='Text-sc-1amvtpj-0-span bcvWKK'])[1]")
    private WebElement liveTV;

    @FindBy(xpath = "//a[@name='africa']")
    private WebElement africaNews;

    @FindBy(xpath = "//h1[@class='metadata-header__title']")
    private WebElement WorldNewsPage;

    @FindBy(xpath = "(//div[@id='account-icon-button'])[1]")
    private WebElement userAccountIcon;

    @FindBy(xpath = "//input[@name='loginEmail']")
    private WebElement emailAddressTab;

    @FindBy(xpath = "//input[@name='loginPassword']")
    private WebElement passwordTab;

    @FindBy(id = "login-form-button")
    private WebElement loginTab;

    @FindBy(xpath = "//button[@id='menuButton']")
    private WebElement openMenu;

    @FindBy(xpath = "//input[@id='header-search-bar']")
    private WebElement searchBar;

    @FindBy(xpath = "(//button[@class='sc-jhAzac sc-gisBJw hioqcg'])[1]")
    private WebElement searchCnnTab;


    @FindBy(xpath = "(//button[@class='Flex-sc-1sqrs56-0 sc-jKJlTe eaiROF'])[1]")
    private WebElement clickOnSearch;

@FindBy(xpath = "(//span[@class='ob-unit ob-rec-text'])[1]")
private WebElement scrollToVideo;

     @FindBy(xpath = "(//a[@name='politics'])[3]")
     private WebElement politicsTab;

     @FindBy(xpath = "//a[@class='Text-sc-1amvtpj-0-a Link-sc-1hkqz5e-0 sc-gZMcBi cSkDDV']")
     private WebElement politicsLogo;

    public void clickOnWorldTab(){
        worldTab.click();
        sleepFor(5);
        Assert.assertTrue(WorldNewsPage.isDisplayed());
    }

    public void clickOnLiveTV(){
        liveTV.click();
        Assert.assertTrue(liveTV.isDisplayed());
    }

    public void clickOnAfricaTab(){
        worldTab.click();
        sleepFor(3);
        africaNews.click();
        sleepFor(5);
        Assert.assertTrue(africaNews.isDisplayed());
    }

    public void clickOnUserIcon(){
        userAccountIcon.click();
        Assert.assertTrue(emailAddressTab.isDisplayed());

    }

    public void loginToCnn() {
        emailAddressTab.sendKeys("adel@gmail.com");
        sleepFor(3);

    }

    public void pwdTab(){
        passwordTab.sendKeys("cnn12345");
    }

    public void loginBtn (){
        loginTab.click();
    }


    public void menuTab(){
        openMenu.click();
        Assert.assertTrue(searchBar.isDisplayed());

    }
    public void searchBtn(){
        searchCnnTab.click();
        Assert.assertTrue(searchBar.isDisplayed());
        searchBar.sendKeys("Test");
        sleepFor(5);
        clickOnSearch.click();
        sleepFor(5);
    }


    public void scrollDown(){

       // scroll(politicsTab);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeAsyncScript("window.scrollBy(0,500)");


    }

    public void clickOnPolitics(){
        politicsTab.click();
        Assert.assertTrue(politicsLogo.isDisplayed());
    }
}
