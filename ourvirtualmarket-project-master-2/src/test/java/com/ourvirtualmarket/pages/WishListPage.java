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
