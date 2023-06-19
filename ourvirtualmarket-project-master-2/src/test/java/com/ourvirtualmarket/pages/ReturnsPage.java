package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReturnsPage extends BasePage{

    DashboardPage dashboardPage = new DashboardPage();

    @FindBy(xpath = "//input[@id='input-firstname']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id='input-lastname']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='input-telephone']")
    public WebElement telephoneNum;

    @FindBy(xpath = "//input[@id='input-order-id']")
    public WebElement orderID;

    @FindBy(xpath = "//input[@id='input-date-ordered']")
    public WebElement orderDate;

    @FindBy(xpath = "//input[@id='input-product']")
    public WebElement productName;

    @FindBy(xpath = "//input[@id='input-model']")
    public WebElement productCode;

    @FindBy(xpath = "//input[@value='3']")
    public WebElement reasonForReturnBtn;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitBtn;

    public void saveOrderInformations(){

    }

    public void assertTheFieldsShouldBeAutomaticallyFilled(){
        Assert.assertNotNull(firstname);
        Assert.assertNotNull(lastname);
        Assert.assertNotNull(email);
    }

    public void fillTheReturnForm(){
        Map<String,String> orderInformations = new HashMap<>();
        dashboardPage.homeButton.click();
        dashboardPage.navigateToAlternativeMenu("Account");
        WebElement viewOrderBtn = Driver.get().findElement(By.xpath("//a[text()='View your order history']"));
        BrowserUtils.clickWithJS(viewOrderBtn);
        WebElement viewBtn = Driver.get().findElement(By.xpath("//a[@href='https://ourvirtualmarket.com/index.php?route=account/order/info&order_id=118']"));
        BrowserUtils.clickWithJS(viewBtn);

//        orderInformations.put("Order ID",orderID.getText());





    }









}
