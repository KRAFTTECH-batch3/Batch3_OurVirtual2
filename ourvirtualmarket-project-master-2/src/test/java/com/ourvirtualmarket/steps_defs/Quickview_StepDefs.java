package com.ourvirtualmarket.steps_defs;

import com.ourvirtualmarket.pages.QuickViewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Quickview_StepDefs {

    QuickViewPage quickViewPage=new QuickViewPage();


    @Given("the user hovers the mouse over any product")
    public void the_user_hovers_the_mouse_over_any_product() {
       // Actions actions=new Actions(driver);
    quickViewPage.hoverQuickViewButton.click();

    }
    @Then("the {string} button appears automatically")
    public void the_button_appears_automatically(String string) {
        Assert.assertTrue(quickViewPage.clickQuickViewButton.isDisplayed());
    }
    @Given("the user clicks on {string}")
    public void the_user_clicks_on(String string) {
    quickViewPage.clickQuickViewButton.click();
    }
    @Then("a pop-up appears that has details of the product")
    public void a_pop_up_appears_that_has_details_of_the_product() {

    }

    @Given("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String string) {

    }
    @Then("the item is added successfully and the total cost is shown to the customer correctly.")
    public void the_item_is_added_successfully_and_the_total_cost_is_shown_to_the_customer_correctly() {

    }

    @Given("the user goes to the top of the home page")
    public void the_user_goes_to_the_top_of_the_home_page() {

    }
    @Then("the total cost is changed correctly")
    public void the_total_cost_is_changed_correctly() {

    }



 }