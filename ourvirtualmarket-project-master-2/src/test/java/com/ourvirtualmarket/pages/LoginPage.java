package com.ourvirtualmarket.pages;


import com.ourvirtualmarket.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "email" )
    public WebElement userEmailInputBox;
    @FindBy(id = "pass")
    public WebElement passwordInputBox;

    @FindBy(id = "send2")
    public  WebElement loginBtn;


    public void login(){
        String userEmail= ConfigurationReader.get("userEmail");
        String password= ConfigurationReader.get("password");
        userEmailInputBox.sendKeys(userEmail);
        passwordInputBox.sendKeys(password);
        loginBtn.click();
    }

    public void login(String userEmail, String password){
        userEmailInputBox.sendKeys(userEmail);
        passwordInputBox.sendKeys(password);
        loginBtn.click();
    }





}
