package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class OrderInformationPage extends BasePage {

    @FindBy(xpath = "(//div[@id='content']//td)[2]")
    public WebElement orderID;

    @FindBy(xpath = "//b[contains(text(),'Date Added')]")
    public WebElement orderDate;

    @FindBy(xpath = "(/html/body/div/div[4]/div/div/div[1]/table/tbody/tr//td)[1]")
    public WebElement productName;

    @FindBy(xpath = "(/html/body/div/div[4]/div/div/div[1]/table/tbody/tr//td)[2]")
    public WebElement productModel;

    public Map<String,String> getAllInformation(){

        Map<String,String> allInformation = new HashMap<>();

        allInformation.put("Product Name", productName.getText());
        allInformation.put("Product Code", productModel.getText());

        for (String value : allInformation.values()) {
            System.out.println(value);
        }

        return allInformation;

    }



}
