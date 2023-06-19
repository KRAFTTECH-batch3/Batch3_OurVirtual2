package com.ourvirtualmarket.pages;


import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//li/a/strong[contains(.,'Home')]")
    public WebElement homeButton;

    @FindBy(xpath = "//li/a/strong[contains(.,'Special Offers')]")
    public WebElement specialOffersButton;

    @FindBy(xpath = "//li/a/strong[contains(.,'Television')]")
    public WebElement televisionButton;

    @FindBy(xpath = "//li/a/strong[contains(.,'Networking')]")
    public WebElement networkingButton;

    @FindBy(xpath = "//li/a/strong[contains(.,'Health & Beauty')]")
    public WebElement healthAndBeautyButton;

    @FindBy(className = "text-shopping-cart")
    public WebElement myCartButton;

    @FindBy(id = "wishlist-total")
    public WebElement myWishListButton;

    @FindBy(className = "fa.fa-refresh")
    public WebElement productComparisonButton;

    @FindBy(name = "search")
    public WebElement searchInputBox;

    @FindBy(name = "submit_search")
    public WebElement searchButton;

    @FindBy(xpath ="//a[text()=' Logout ']" )
    public WebElement logoutButton;

    @FindBy(xpath = "(//a[text()='Register'])[2]")
    public WebElement registerButton;

    /** viewCardButton, myCartButton'a hover yapıldığında (MY CART'ta ürün varsa) görülür.
     * */
    @FindBy(partialLinkText = "View Cart")
    public WebElement viewCartButton;

    /** checkoutButton, myCartButton'a hover yapıldığında (MY CART'ta ürün varsa) görülür.
     * */
    @FindBy(partialLinkText = "Checkout")
    public WebElement checkoutButton;
    @FindBy(xpath = "//div[@class='box-service box-footer']//a[contains(text(),'Returns')]")
    public WebElement returnsServiceFromFooterMenu;

    @FindBy(xpath = "//div[@id='so-groups']/a")
    public List<WebElement> alternativeMenuAtTheMiddleRight;

    @FindBy(xpath = "//a[@class='account-url'and @href='https://ourvirtualmarket.com/index.php?route=account/account']")
    public WebElement accountBtnFromPopupMyAccount;




    /**
     <h1> Navigate To Module </h1>
     @param tab  Home, Special Offers, Television, Networking, Health & Beauty
     Gitmek istediğiniz kategori ismini parametreye girerek gitmenizi sağlar
     @author Emre
     @see <a href = "https://ourvirtualmarket.com/">Our Virtual Market</a>
      *  */
    public void navigateToModule(String tab){
        Driver.get().findElement(By.xpath("//li/a/strong[contains(.,'"+tab+"')]")).click();
    }

    /**
     <h1> Logout </h1>
     hesaptan çıkış yapmak için kullanılır
     @author Emre
     @see <a href = "https://ourvirtualmarket.com/">Our Virtual Market</a>
      *  */
    public void logout(){
        BrowserUtils.waitForClickablility(logoutButton,5);
        logoutButton.click();
    }
}

