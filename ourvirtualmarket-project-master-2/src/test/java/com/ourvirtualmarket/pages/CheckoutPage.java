package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    @FindBy(xpath = "//input[@id='button-payment-address']")
    public WebElement billingContBtn;

    @FindBy(xpath = "//input[@id='button-shipping-address']")
    public WebElement deliveryContBtn;

    @FindBy(xpath = "//input[@id='button-shipping-method']")
    public WebElement deliveryMethodContBtn;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkbox;

    @FindBy(xpath = "//input[@id='button-payment-method']")
    public WebElement paymentMethodContBtn;

    @FindBy(xpath = "//input[@id='button-confirm']")
    public WebElement confirmOrderBtn;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public WebElement completeContBtn;

    public void makeCheckout(){
        BrowserUtils.clickWithJS(billingContBtn);
        BrowserUtils.clickWithJS(deliveryContBtn);
        BrowserUtils.clickWithJS(deliveryMethodContBtn);
        BrowserUtils.clickWithJS(checkbox);
        BrowserUtils.clickWithJS(paymentMethodContBtn);
        BrowserUtils.clickWithJS(confirmOrderBtn);
        assertSuccessCheckout();
        BrowserUtils.clickWithJS(completeContBtn);
    }

    public void assertSuccessCheckout(){
        String expectedMessage = "Your order has been successfully processed!";
        String actualMessage = Driver.get().findElement(By.xpath("//h1[contains(text(),'Your order has been placed!')]")).getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    public void takeOrderDetails(){


    }








}
