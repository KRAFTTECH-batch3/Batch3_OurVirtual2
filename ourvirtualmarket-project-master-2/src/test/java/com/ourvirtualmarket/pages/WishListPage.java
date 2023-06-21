package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WishListPage extends BasePage{
    @FindBy(id="wishlist-total")
    public WebElement wishListEmpty;

    @FindBy(xpath = "//*[@id='wishlist-total'] [contains(@title,'Wish List ')]")
    public WebElement wishList;
    @FindBy(xpath = "//*[@class='btn btn-danger']")
    public WebElement removeButton;
    @FindBy(xpath = "//*[@class='btn btn-danger']")
    public List<WebElement> myWishList;
    @FindBy(xpath = "//img[@title=\"Your Store\"]")
    public WebElement market;
    @FindBy(xpath = "//p[text()='Your wish list is empty.']")
    public WebElement emptyMessage;


    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement addToCard;

    @FindBy(xpath = "//a[@class='btn btn-view-cart inverse']")
    public WebElement viewCard;
    @FindBy(xpath = "//a[text()='Shopping Cart']")
    public WebElement shoppingCard;

    @FindBy (xpath = "//*[@class='caption']")
    public List<WebElement>items;

    @FindBy (xpath = "//span[.='Add to Wish List']")
    public List<WebElement>addToWish;
    @FindBy (xpath = "//div[@class='caption'] //*[@title='Nicky Clarke NHD146 Hair Therapy Touch Control Hair Dryer']")
    public WebElement firstItem;

    @FindBy (xpath = "//button[@data-original-title=\"Add to Cart\"]")
    public List<WebElement>addList;

    @FindBy (xpath = "//button[@data-original-title=\"Add to Cart\"]")
    public WebElement addItem;

    @FindBy(xpath = "//span[@aria-hidden=\"true\"]")
    public WebElement close;


    @FindBy(xpath = "//span[@class='icon-c']")
    public WebElement add;


    @FindBy (xpath = "//div[@class='checkout clearfix']//a[@class='btn btn-view-cart inverse'][normalize-space()='View Cart']")
    public WebElement wiewCard;
    @FindBy (xpath = "(//tbody)[2]//tr")
    public List<WebElement>addToList;


    public void cleanItems() throws InterruptedException {
        while (myWishList.contains(removeButton)){
            removeButton.click();
            Thread.sleep(3000);
        }
    }

    public void addItems() throws InterruptedException {
        if(!wishList.getText().contains("0")) {
            wishListEmpty.click();
            Thread.sleep(2000);
            cleanItems();
            Thread.sleep(2000);
            market.click();
        }
    }


}
