package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class ProductsPage extends BasePage{

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

}
