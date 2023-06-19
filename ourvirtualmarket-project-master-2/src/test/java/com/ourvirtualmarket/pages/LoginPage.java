package com.ourvirtualmarket.pages;


import com.ourvirtualmarket.utilities.BrowserUtils;
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

    /**
     <h1> login with parameters </h1>
     @param userEmail, password
     @return kullanlan mail ve şifreye göre siteye login olmanızı sağlar
     @author Busra
     @see <a href = "https://ourvirtualmarket.com/">Our Virtual Market</a>
      *  */
    public void login(String userEmail, String password){
        BrowserUtils.waitFor(2);
        userEmailInputBox.sendKeys(userEmail);
        passwordInputBox.sendKeys(password);
        loginBtn.click();
    }





}
