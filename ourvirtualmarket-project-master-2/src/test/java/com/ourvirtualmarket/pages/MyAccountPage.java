package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{


    @FindBy(partialLinkText = "Edit your account information")
    public WebElement editYourAccountInformationButton;

    @FindBy(xpath = "//div[@class='list-group']/a[text()='Logout']")
    public WebElement alternativeLogoutButton;

    @FindBy(name = "firstname")
    public WebElement firstNameInputBox;

    @FindBy(name = "lastname")
    public WebElement lastNameInputBox;

    @FindBy(id = "input-email")
    public WebElement emailInputBox;

    @FindBy(name = "telephone")
    public WebElement telephoneInputBox;

    @FindBy(css = "[class='form-horizontal']")
    public WebElement personalDetailForm;

    public void navigateToLeftTabs(String tab){
        WebElement element = Driver.get().findElement(By.xpath("//div[@id='content']//li/a[text()='" + tab + "']"));
        BrowserUtils.waitForClickablility(element,5);
        element.click();
    }









}
