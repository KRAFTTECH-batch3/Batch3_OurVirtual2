package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage{
    CheckoutPage checkoutPage = new CheckoutPage();
    DashboardPage dashboardPage = new DashboardPage();
    SoftAssertions softAssertions = new SoftAssertions();
    String expectedProductName;
    @FindBy(xpath = "(//input[@value='Buy Now'])[1]")
    public WebElement buyNowBtn;

    @FindBy(id = "tab-description")
    public WebElement productDescription;

    @FindBy(xpath = "//div[@class='title-product']/h1")
    public WebElement productName;

    @FindBy(id = "price-old")
    public WebElement price;

    @FindBy(xpath = "//div[@class='stock']/i")
    public WebElement availabilityStatus;

    @FindBy(xpath = "//div[@class='inner-box-viewed ']")
    public WebElement viewed;

    @FindBy(css = "input[value='Add to Cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement closePopUpOfAddedProduct;

    @FindBy(xpath = "//*[.=' Added to cart successfully. What is next?']")
    public WebElement popUpOfAddedProduct;

    @FindBy(css = ".fa.fa-shopping-bag")
    public WebElement myCartIcon;

    @FindBy(xpath = "//li[@class='content-item']//td[@class='text-left']")
    public List<WebElement> listOfAddedProduct;


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

    /**
     <h1> Buy a Product </h1>
     bazı senaryolarda precondition olarak kullanıcının ürün almış olması gerekmektedir.
     Bu tarz durumlarda bu method ile kullanıcıya hızlı bir şekilde ürün aldırabilirsiniz.
     @author Ferid
     @see <a href = "https://ourvirtualmarket.com/">Our Virtual Market</a>
      *  */
    public void buyAProduct(){
       navigateToProduct("WAHL 7061-117 Lithium Lifeproof Mens Electric Shaver");
        buyNowBtn.click();
        checkoutPage.makeCheckout();
        BrowserUtils.clickWithJS(dashboardPage.closeButton);
    }

    /**
     <h1> Navigate To Product </h1>
     @param productNumber
     @return bu metod ile parametreye kaçıncı ürünü görmek istediğinizi girerek, ürünün sayfasına gidebilirsiniz.
     @author Busra
     @see <a href = "https://ourvirtualmarket.com/">Our Virtual Market</a>
      *  */
    public void navigateWithProductNumber(String productNumber){
        Driver.get().findElement(By.xpath("(//div[@class='product-item-container']/div[@class='left-block'])["+productNumber+"]")).click();
    }

    public void assertProductPageIsVisible(){
        BrowserUtils.hover(productDescription);
        BrowserUtils.verifyElementDisplayed(productDescription);
        BrowserUtils.hover(productName);
    }

    public void assertProductPageDetails(String productName, String price, String availabilityStatus,String viewes){
        expectedProductName = BrowserUtils.getText(By.xpath("//div[@class='title-product']/h1"));
        Assert.assertEquals(expectedProductName,productName);
        String expectedPrice = BrowserUtils.getText(By.id("price-old"));
        Assert.assertEquals(expectedPrice,price);
        String availability = BrowserUtils.getText(By.xpath("//div[text()=' In Stock']"));
        String expectedAvailabilityStatus = availability.substring(14);
        Assert.assertEquals(expectedAvailabilityStatus,availabilityStatus);
        assertViewedNumber(viewes);
    }

    public void assertViewedNumber(String viewes){
        String viewed = BrowserUtils.getText(By.xpath("//div[@class='inner-box-viewed ']"));
        String[] array = viewed.split(" ");
        int i = Integer.parseInt(array[1]);
        System.out.println(i);
        int expectedViewes = i+1;
        System.out.println(expectedViewes);
        System.out.println(expectedViewes + " times");
        softAssertions.assertThat(viewes).isEqualTo(expectedViewes+" times");
    }

    public void assertButtons(){
        Assert.assertTrue(addToCartButton.isDisplayed());
        Assert.assertTrue(buyNowBtn.isDisplayed());
    }

    public void closeThePopUpForAddedProduct(){
        BrowserUtils.waitForVisibility(closePopUpOfAddedProduct,5);
        closePopUpOfAddedProduct.click();
    }

    public void hoverShoppingCartIcon() {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(myCartIcon).perform();
    }

    public void verifyTheProductInMyCartIcon(){
        for (int i = 0; i < listOfAddedProduct.size(); i++) {
            if (listOfAddedProduct.get(i).getText().equals(expectedProductName)){
                Assert.assertEquals(listOfAddedProduct.get(i).getText(),expectedProductName);
            }
        }
    }

}
