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

    OrderInformationPage orderInformationPage = new OrderInformationPage();

    DashboardPage dashboardPage = new DashboardPage();

    OrderHistoryPage orderHistoryPage = new OrderHistoryPage();

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

        orderInformations.put("Order ID",orderHistoryPage.firstOrderID.getText());
        orderInformations.put("Order Date",orderHistoryPage.firstOrderDate.getText());


        WebElement viewBtn = Driver.get().findElement(By.xpath("//a[@href='https://ourvirtualmarket.com/index.php?route=account/order/info&order_id=118']"));
        BrowserUtils.clickWithJS(viewBtn);

        Map<String,String> orderInformations2 = new HashMap<>();

        orderInformations2.put("Product Name",orderInformationPage.productName.getText());
        orderInformations2.put("Product Code",orderInformationPage.productModel.getText());

        orderInformations.putAll(orderInformations2);

        BrowserUtils.clickWithJS(returnsServiceFromFooterMenu);



        orderID.sendKeys(orderInformations.get("Order ID"));
        orderDate.sendKeys(orderInformations.get("Order Date"));
        productName.sendKeys(orderInformations.get("Product Name"));
        productCode.sendKeys(orderInformations.get("Product Code"));
        reasonForReturnBtn.click();
    }

    public void assertSuccessfulReturnMessage(){
        String currentUrl = Driver.get().getCurrentUrl();
        String expectedURL = "https://ourvirtualmarket.com/index.php?route=account/return/success";
        Assert.assertEquals(expectedURL,currentUrl);

    }









}
