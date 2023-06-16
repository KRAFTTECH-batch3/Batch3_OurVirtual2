package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//button[@title='Close']")
    public WebElement closeButton;

    @FindBy(xpath ="//a[@class='link-lg']" )
    public WebElement loginButton;

    @FindBy(xpath ="//a[text()=' Logout ']" )
    public WebElement logoutButton;

    @FindBy(css = ".lazyautosizes.lazyloaded")
    public WebElement yourStoreBtn;

    public void closePopUp(){
        closeButton.click();
    }


}
