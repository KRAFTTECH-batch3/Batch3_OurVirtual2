package com.ourvirtualmarket.steps_defs;

import com.ourvirtualmarket.pages.DashboardPage;
import com.ourvirtualmarket.pages.ProductsPage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;

public class AddToCart_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    ProductsPage productsPage = new ProductsPage();
    SoftAssertions softAssertions = new SoftAssertions();

    @Given("The user is on the homepage")
    public void the_user_is_on_the_homepage() {
        dashboardPage.closePopUp();
    }

    @When("The user go to the Networking module")
    public void the_user_go_to_the_networking_module(String moduleName) {
        dashboardPage.navigateToModule(moduleName);
    }


    @When("The user select the third product")
    public void the_user_select_the_third_product() {
        productsPage.navigateWithProductNumber("3");
    }

    @Then("The user should be able to see product details page")
    public void the_user_should_be_able_to_see_product_details_page() {
       productsPage.assertProductPageIsVisible();
    }

    @And("The user should be able to see {string} and {string} and {string} and {string}")
    public void theUserShouldBeAbleToSeeAndAndAndAnd(String productName, String price, String availabilityStatus, String viewes) {
        productsPage.assertProductPageDetails(productName,price,availabilityStatus,viewes);
    }
    @Then("The user should be able to see add to cart button and buy now button next to the product")
    public void the_user_should_be_able_to_see_add_to_cart_button_and_buy_now_button_next_to_the_product() {
        productsPage.assertButtons();
    }

    @When("The user clicks add to cart button")
    public void the_user_clicks_add_to_cart_button() {
        productsPage.addToCartButton.click();
    }

    @Then("The user should be able to see the pop up page about added product")
    public void the_user_should_be_able_to_see_the_pop_up_page_about_added_product() {
        softAssertions.assertThat(productsPage.popUpOfAddedProduct.isDisplayed());
    }

    @When("The user navigates to shopping cart icon on dashboard page")
    public void the_user_navigates_to_shopping_cart_icon_on_dashboard_page() {
        productsPage.closeThePopUpForAddedProduct();
        productsPage.hoverShoppingCartIcon();
    }

    @Then("The user should be able to see added product in the shopping cart")
    public void the_user_should_be_able_to_see_added_product_in_the_shopping_cart() {
        productsPage.verifyTheProductInMyCartIcon();
        softAssertions.assertAll();
    }




}


   
   
    
  
   
