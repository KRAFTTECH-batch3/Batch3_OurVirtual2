package com.ourvirtualmarket.steps_defs;

import com.ourvirtualmarket.pages.*;
import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Return_StepDefs {

    ProductsPage productsPage = new ProductsPage();
    AlternativeAddToCartPage alternativeAddToCartPage = new AlternativeAddToCartPage();
    ReturnsPage returnPage = new ReturnsPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    DashboardPage dashboardPage = new DashboardPage();

    @When("the user has bought a product")
    public void the_user_has_bought_a_product() {
        productsPage.navigateToProduct("WAHL 7061-117 Lithium Lifeproof Mens Electric Shaver");
        productsPage.buyNowBtn.click();
        checkoutPage.makeCheckout();
        BrowserUtils.clickWithJS(dashboardPage.closeButton);
    }
    @Given("the user visits the website")
    public void the_user_visits_the_website() {



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


