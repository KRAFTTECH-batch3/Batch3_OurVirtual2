package com.ourvirtualmarket.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReturnsPage extends BasePage{

    @FindBy(xpath = "//input[@id='input-firstname']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id='input-lastname']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='input-telephone']")
    public WebElement telephoneNum;

    @FindBy(xpath = "//input[@id='input-order-id']")
    public WebElement orderID;

    @FindBy(xpath = "//input[@id='input-date-ordered']")
    public WebElement orderDate;

    @FindBy(xpath = "//input[@id='input-product']")
    public WebElement productName;

    @FindBy(xpath = "//input[@id='input-model']")
    public WebElement productCode;

    @FindBy(xpath = "//input[@value='3']")
    public WebElement reasonForReturnBtn;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitBtn;

    public void assertTheFieldsShouldBeAutomaticallyFilled(){
        Assert.assertNotNull(firstname);
        Assert.assertNotNull(lastname);
        Assert.assertNotNull(email);
    }









}
