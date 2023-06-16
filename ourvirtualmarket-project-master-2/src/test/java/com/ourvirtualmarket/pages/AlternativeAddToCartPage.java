package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlternativeAddToCartPage extends BasePage {

    @FindBy(xpath = "//button[@class='popup-close']")
    public WebElement popUp;

    @FindBy(xpath = "//a[.='Login'] ")
    public WebElement login;

    @FindBy(id= "email")
    public WebElement email;

    @FindBy(id = "pass")
    public WebElement password;

    @FindBy(xpath = "//span[text()='Login']")
    public WebElement LoginButton;

    @FindBy(xpath = "//img[@class='lazyautosizes lazyloaded'][@title='Your Store']")
    public WebElement homePage;

    @FindBy(xpath = "//button[@title='Close']")
    public WebElement closePopUp;

    @FindBy(xpath = "//span[text()='Trending items']")
    public WebElement trendingItems;

    @FindBy(xpath = "(//div[@class='ltabs-item ']//a[@href='https://ourvirtualmarket.com/index.php?route=product/product&product_id=7453510'])[1]")
    public WebElement chosenItem;

    @FindBy(xpath = "//button[@onclick=\"cart.add('7453510 ');\"]//span[text()='Add to cart ']")
    public WebElement addtoCartButton;

    @FindBy(xpath = "(//div[@class='left-block'])[5]//span")
    public List<WebElement> shortCuts;

    @FindBy(css = ".alert.alert-success")
    public WebElement successMessage;


    @FindBy(xpath = "//div/span/i[@class='fa fa-shopping-bag']")
    public WebElement myCartButton;

    @FindBy(xpath = "//a[text()='WAHL 7061-117 Lithium Lifeproof Mens Electric Shaver']")
    public WebElement addedItem;


//    public void login(String eml, String pswrd){
//        email.sendKeys(eml);
//        password.sendKeys(pswrd);
//        LoginButton.click();
//        homePage.click();
//        closePopUp.click();}

        public void goToHomePage(){
        homePage.click();
        closePopUp.click();
    }


    public void hoverItem() {
        Actions actions = new Actions(Driver.get());
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].scrollIntoView(true);", chosenItem);
        actions.moveToElement(chosenItem).perform();
    }

    public void hoverOnShortcuts() {
        Actions actions = new Actions(Driver.get());
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].scrollIntoView(true);", chosenItem);
        for (int i = 0; i < shortCuts.size(); i++) {
            actions.moveToElement(shortCuts.get(i)).perform();
        }
    }

    public void assertItemTexts(List<String> shortcutNames) {
//        WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(15));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].scrollIntoView(true);", shortCuts.get(0));
        Actions actions = new Actions(Driver.get());
        for (int i = 0; i < shortCuts.size(); i++) {
//            wait.until(ExpectedConditions.visibilityOf(shortCuts.get(i)));
            actions.moveToElement(shortCuts.get(i)).perform();
            Assert.assertEquals(shortcutNames.get(i),shortCuts.get(i).getText());
        }
    }

    public void alternativeAddToCart(){
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].scrollIntoView(true);", chosenItem);
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(chosenItem).perform();
        actions.moveToElement(addtoCartButton).perform();
        BrowserUtils.clickWithJS(addtoCartButton);

    }

    public void successMessageAssertion(){
        Assert.assertTrue(successMessage.isDisplayed());
    }

    public void hoverMyCartIcon(){
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(myCartButton).perform();
        actions.moveToElement(addedItem).perform();
    }

    public void addedItemVisibilityAsertion(){
        Assert.assertTrue(addedItem.isDisplayed());
    }
}
