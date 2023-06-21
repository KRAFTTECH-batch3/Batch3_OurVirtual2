package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFunctionPage extends BasePage {

    @FindBy(xpath = "//input[@class='autosearch-input form-control']")
    public WebElement searchBoxAppear;

    @FindBy(xpath = "//input[@placeholder='Search'][@class='autosearch-input form-control']")
    public WebElement searchText;

    @FindBy(xpath = "//button[@class='button-search btn btn-default btn-lg']")
    public WebElement searchBoxButton;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement searchOrderText;
}
