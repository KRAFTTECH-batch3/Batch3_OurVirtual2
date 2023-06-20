package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(className = "sticky-mysearch")
    public WebElement searchButton;

    @FindBy(id = "button-search" )
    public WebElement popSearchButton;

    @FindBy(xpath = "//input[@id='input-search']" )
    public WebElement popUpSearchButtonField;

    @FindBy(xpath = "//input[@placeholder='Keywords']")
    public WebElement relatedProductPage;


}
