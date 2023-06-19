package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    @FindBy(id = "button-cart")
    public WebElement addToCartButton_OnProductPage;

    @FindBy(css = "button[class='close']")
    public WebElement closeTheSuccessPopUpButton;

    /**
     <h1> Navigate To Product </h1>
     @param productName
     bu metotda parametreye ürün ismi girerek, ürünün sayfasına gidebilirsiniz
     @author Emre
     @see <a href = "https://ourvirtualmarket.com/">Our Virtual Market</a>
      *  */
    public void navigateToProduct(String productName){
        WebElement product = Driver.get().findElement(By.partialLinkText(productName));
        BrowserUtils.clickWithJS(product);
    }
    public void hoverTheProduct(String productName){
        WebElement product = Driver.get().findElement(By.partialLinkText(productName));
        BrowserUtils.scrollToElement(product);
        BrowserUtils.hover(product);
    }

    public void clickTheAddToCartButtonOnTheProduct(String productName){
        hoverTheProduct(productName);
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath("//a[contains(text(),'"+productName+"')]" +
                "/../../..//button[.='Add to Cart']")).click();

    }
}
