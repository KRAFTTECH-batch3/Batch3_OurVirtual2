package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class OrderInformationPage extends BasePage {

    @FindBy(xpath = "//b[contains(text(),'Order ID')]")
    public WebElement orderID;

    @FindBy(xpath = "//b[contains(text(),'Date Added')]")
    public WebElement orderDate;

    @FindBy(xpath = "//td[contains(text(),'Product Name')]")
    public WebElement productName;

    @FindBy(xpath = "//td[contains(text(),'Model')]")
    public WebElement productModel;

    public Map<String,String> getAllInformation(){
        Map<String,String> allInformation = new HashMap<>();
        allInformation.put("Order ID", BrowserUtils.getText());
    }



}
