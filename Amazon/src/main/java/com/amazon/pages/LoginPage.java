package com.amazon.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;
import pnt.automation.base.TestBase;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement emailAddressTab;

    @FindBy(id = "continue")
    private WebElement continueButton;


    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement passwordTab;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement signInButton;

    @FindBy(xpath = "//h4[text()='There was a problem']")
    private WebElement thereWasAProblemAlert;

    public void TypeInEmailAddress() {

        emailAddressTab.sendKeys("AdelAitbraham@gmail.com");
        sleepFor(3);
        continueButton.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(emailAddressTab.isDisplayed());
    }
    public void ClickContinueButton() {

        continueButton.click();
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/ap/signin";
        Assert.assertTrue(actualURL.contains(expectedURL));
    }
    public void typeInPasswordTab() {
        sleepFor(4);
        passwordTab.sendKeys("United12303");
        sleepFor(2);
      Assert.assertTrue(passwordTab.isDisplayed());
    }

    public void clickOnSignInButton() {
        signInButton.click();
        sleepFor(2);
        Assert.assertTrue(thereWasAProblemAlert.isDisplayed());
    }
}
