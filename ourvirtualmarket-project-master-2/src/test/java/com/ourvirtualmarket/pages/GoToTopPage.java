package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoToTopPage extends BasePage{
    @FindBy(xpath = "//a[@class='sticky-backtop']")
    public WebElement hoverGoToTop;

}
