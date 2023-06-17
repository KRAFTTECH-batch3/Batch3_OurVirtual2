package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(className = "sticky-mysearch")
    public WebElement searchButton;

    @FindBy(id = "button-search" )
    public WebElement popSearchButton;
}
