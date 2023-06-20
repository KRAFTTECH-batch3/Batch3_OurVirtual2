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

    @FindBy(xpath = "(//a[@class='popup-close'])[4]")
    public WebElement popUpCloseButton;

    @FindBy(xpath = "//div[@class='main-menu col-lg-6 col-md-7']")
    public WebElement homePageHeader;



}
