package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLogoutPage extends BasePage{

    @FindBy(xpath = "(//div[@id='content']/p)[1]")
    public WebElement helperText1;

    @FindBy(xpath = "(//div[@id='content']/p)[2]")
    public WebElement helperText2;

    @FindBy(xpath = "//div[@id='content']//div/a")
    public WebElement continueButton;


    public void goBackPreviousPage(){
        Driver.get().navigate().back();
    }
}
