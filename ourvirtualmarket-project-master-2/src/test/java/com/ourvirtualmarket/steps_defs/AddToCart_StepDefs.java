package com.ourvirtualmarket.steps_defs;

import com.ourvirtualmarket.pages.DashboardPage;
import com.ourvirtualmarket.pages.ProductsPage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart_StepDefs {

    DashboardPage dashboardPage;// = new DashboardPage();
    ProductsPage productsPage;// = new ProductsPage();

    @Given("The user is on the homepage")
    public void the_user_is_on_the_homepage() {
        dashboardPage = new DashboardPage();
        dashboardPage.closePopUp();
    }

    @When("The user go to the Networking module")
    public void the_user_go_to_the_networking_module() {

    }

    @When("The user select the third product")
    public void the_user_select_the_third_product() {

    }

    @Then("The user should be able to see product details page")
    public void the_user_should_be_able_to_see_product_details_page() {

    }

    @Then("The user should be able to see product name, price, availability status, and views")
    public void the_user_should_be_able_to_see_product_name_price_availability_status_and_views() {

    }

    @Then("The user should be able to see add to cart button and buy now button next to the product")
    public void the_user_should_be_able_to_see_add_to_cart_button_and_buy_now_button_next_to_the_product() {

    }

    @When("The user clicks add to cart button")
    public void the_user_clicks_add_to_cart_button() {
        productsPage = new ProductsPage();
        BrowserUtils.clickWithJS(productsPage.addToCartButton_OnProductPage);
    }

    @Then("The user should be able to see the pop up page about added product")
    public void the_user_should_be_able_to_see_the_pop_up_page_about_added_product() {

    }

    @When("The user navigates to shopping cart icon on dashboard page")
    public void the_user_navigates_to_shopping_cart_icon_on_dashboard_page() {

    }

    @Then("The user should be able to see added product in the shopping cart")
    public void the_user_should_be_able_to_see_added_product_in_the_shopping_cart() {

    }
    @And("The user close the Added to cart successfully popup")
    public void theUserCloseTheAddedToCartSuccessfullyPopup() {
        productsPage = new ProductsPage();
        BrowserUtils.waitForClickablility(productsPage.closeTheSuccessPopUpButton,5);
        productsPage.closeTheSuccessPopUpButton.click();
    }

    @When("The user hover the My Cart")
    public void theUserHoverTheMyCart() {
        dashboardPage = new DashboardPage();
        BrowserUtils.hover(dashboardPage.myCartButton);
        BrowserUtils.waitFor(1);
    }

    @And("The user hover the {string} and click the Add to Cart button on the product")
    public void theUserHoverAndClickTheAddToCartButtonOnTheProduct(String productName) {
        productsPage = new ProductsPage();
        productsPage.clickTheAddToCartButtonOnTheProduct(productName);
    }


    @When("The user click the View Cart")
    public void theUserClickTheViewCart() {
        dashboardPage= new DashboardPage();
        BrowserUtils.clickWithJS(dashboardPage.viewCartButton);
    }


}


   
   
    
  
   
