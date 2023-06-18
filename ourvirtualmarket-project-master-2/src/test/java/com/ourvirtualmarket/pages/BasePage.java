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

    @FindBy(xpath = "//div[@class='box-service box-footer']//a[contains(text(),'Returns')]")
    public WebElement returnsServiceFromFooterMenu;

    @FindBy(xpath = "//div[@id='so-groups']/a")
    public List<WebElement> alternativeMenuAtTheMiddleRight;


    /**
        <h1> Navigate To Module </h1>
     @param tab  Home, Special Offers, Television, Networking, Health & Beauty
     @return gitmek istediğiniz kategori ismini parametreye girerek gitmenizi sağlar
     @author Emre
     @see <a href = "https://ourvirtualmarket.com/">Our Virtual Market</a>
     *  */
    public void navigateToModule(String tab){
        Driver.get().findElement(By.xpath("//li/a/strong[contains(.,'"+tab+"')]")).click();
    }

    /**
     <h1> Logout </h1>
     @return hesaptan çıkış yapmak için kullanılır
     @author Emre
     @see <a href = "https://ourvirtualmarket.com/">Our Virtual Market</a>
      *  */
    public void logout(){
        BrowserUtils.waitForClickablility(logoutButton,5);
        logoutButton.click();
    }

    /**
     <h1> Navigate To Service </h1>
     @param service  Contact Us, Returns, Support, Site Map, Customer Service, Custom Link
     @return footer menüde(sayfanın en altında) yer alan ve gitmek istediğiniz service ismini parametreye girerek gitmenizi sağlar
     @author Ferid
     @see <a href = "https://ourvirtualmarket.com/">Our Virtual Market</a>
      *  */

    public void navigateToService(String service){
        Driver.get().
                findElement(By.xpath("//div[@class='box-service box-footer']//a[contains(text(),'"+service+"')]"))
                .click();
    }

    /**
     <h1> Assert service is there </h1>
     @param serviceName  Contact Us, Returns, Support, Site Map, Customer Service, Custom Link
     @return footer menüde(sayfanın en altında) gitmek istediğiniz service'in var olup olmadığını assert etmek için
     service ismini parametreye girmeniz yeterlidir.
     @author Ferid
     @see <a href = "https://ourvirtualmarket.com/">Our Virtual Market</a>
     */

    public void assertServiceIsThere(String serviceName) {
        String expectedServiceTextName = serviceName;
        String actualServiceTextName = Driver.get().findElement(By.xpath("//div[@class='box-service box-footer']//a[contains(text(),'" + serviceName + "')]"))
                .getText();
        Assert.assertEquals(expectedServiceTextName,actualServiceTextName);
    }


    /**
     <h1> Navigate to alternative menu </h1>
     @param menuName Categories, Cart, Account, Search, Recent View, Go to Top
     @return her sayfada ortada sağda gözüken alternatif menü'de gitmek istediğiniz sayfanın menuName'ini parametreye girmeniz yeterlidir.
     @author Ferid
     @see <a href = "https://ourvirtualmarket.com/">Our Virtual Market</a>
     */
    public void navigateToAlternativeMenu(String menuName){
        WebElement menuNameElement = Driver.get().findElement(By.xpath("//div[@id='so-groups']/a//span[text()='"+menuName+"']"));

        BrowserUtils.clickWithJS(menuNameElement);
 //       Driver.get().findElement(By.xpath("//div[@id='so-groups']/a//span[text()='"+menuName+"']"));
    }




}

