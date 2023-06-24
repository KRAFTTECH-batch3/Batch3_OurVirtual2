package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickViewPage extends BasePage{

    @FindBy(xpath = "//span[text()='Quick view']")
    public WebElement hoverQuickViewButton;

    @FindBy(xpath = "(//span[text()='Quick view'])[1]")
    public WebElement clickQuickViewButton;


}





