package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

    @FindBy(partialLinkText = "Edit your account information")
    public WebElement editYourAccountInformationButton;

    @FindBy(xpath = "//div[@class='list-group']/a[text()='Logout']")
    public WebElement alternativeLogoutButton;


}
