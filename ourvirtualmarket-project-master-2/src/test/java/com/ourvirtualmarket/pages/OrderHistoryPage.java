package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class OrderHistoryPage extends BasePage{
    @FindBy(xpath = "(//td[@class='text-right' and contains(text(),'#')])[1]")
    public WebElement firstOrderID;

    @FindBy(xpath = "(//td[@class='text-left' and contains(text(),'/')])[1]")
    public WebElement firstOrderDate;

    @FindBy(xpath = "(//a[@data-original-title='View'])[1]")
    public WebElement firstOrderViewBtn;

    public Map<String,String> sumInfFromOrderHistoryPage(){
        Map<String,String> infos = new HashMap<>();


        return infos;
    }










}
