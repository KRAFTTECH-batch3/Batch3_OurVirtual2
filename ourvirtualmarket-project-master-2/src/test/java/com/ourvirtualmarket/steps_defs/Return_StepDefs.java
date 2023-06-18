package com.ourvirtualmarket.steps_defs;

import com.ourvirtualmarket.pages.*;
import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Return_StepDefs {

    ProductsPage productsPage = new ProductsPage();
    AlternativeAddToCartPage alternativeAddToCartPage = new AlternativeAddToCartPage();
    ReturnsPage returnPage = new ReturnsPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    DashboardPage dashboardPage = new DashboardPage();

    @When("the user has bought a product")
    public void the_user_has_bought_a_product() {
 //       returnPage.navigateToAlternativeMenu("Account");
        Driver.get().findElement(By.xpath("//a[text()='View your order history']")).click();

        String text = Driver.get().findElement(By.xpath("(//tbody//tr//td[text()='#118'])[1]")).getText();
        if(text==null) productsPage.buyAProduct();
        Assert.assertNotNull(Driver.get().findElement(By.xpath("(//tbody//tr//td[text()='#118'])[1]")));
    }

    @Given("the user visits the website")
    public void the_user_visits_the_website() {
        alternativeAddToCartPage.goToHomePage();
    }

    @When("the user scrolls to the bottom of the page")
    public void the_user_scrolls_to_the_bottom_of_the_page() {
        BrowserUtils.scrollToElement(returnPage.returnsServiceFromFooterMenu);

    }

    @Then("the user should see the {string} link")
    public void the_user_should_see_the_link(String string) {
        returnPage.assertServiceIsThere("Returns");
        BrowserUtils.verifyElementDisplayed(returnPage.returnsServiceFromFooterMenu);
        BrowserUtils.waitFor(3);
    }

}


