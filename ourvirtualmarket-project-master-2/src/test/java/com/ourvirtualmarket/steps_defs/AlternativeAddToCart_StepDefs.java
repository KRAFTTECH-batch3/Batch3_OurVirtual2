package com.ourvirtualmarket.steps_defs;

import com.ourvirtualmarket.pages.AlternativeAddToCartPage;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class AlternativeAddToCart_StepDefs {
    AlternativeAddToCartPage alternativeAddToCartPage = new AlternativeAddToCartPage();

//    @Given("the user on the home page")
//    public void the_user_on_the_home_page() {
//        Driver.get().get(ConfigurationReader.get("url"));
//        alternativeAddToCartPage.popUp.click();
//        BrowserUtils.clickWithJS(alternativeAddToCartPage.login);
//
//    }

//    @Given("the user logged in with email {string} and password {string}")
//    public void the_user_logged_in_with_email_and_password(String email, String password) {
//        alternativeAddToCartPage.login(email, password);
//    }

    @Given("the user scrolls down on the page and he or she should reach trending items")
    public void the_user_scrolls_down_on_the_page_and_he_or_she_should_reach_trending_items() {
        alternativeAddToCartPage.goToHomePage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].scrollIntoView(true);", alternativeAddToCartPage.trendingItems);
        String expectedText = "TRENDING ITEMS";
        Assert.assertEquals(expectedText, alternativeAddToCartPage.trendingItems.getText());

    }

    @Given("the user hovers on the chosen product thumbnail")
    public void the_user_hovers_on_the_chosen_product_thumbnail() {
        alternativeAddToCartPage.goToHomePage();
        alternativeAddToCartPage.hoverItem();
    }

    @When("the user hovers on every separate shortcut icons on the product thumbnail")
    public void the_user_hovers_on_every_separate_shortcut_icons_on_the_product_thumbnail() throws InterruptedException {
        alternativeAddToCartPage.hoverOnShortcuts();
    }

    @Then("the icons texts should be equal to belows")
    public void the_icons_texts_should_be_equal_to_belows(io.cucumber.datatable.DataTable dataTable){
        List<String> itemTextList = dataTable.asList();
        alternativeAddToCartPage.assertItemTexts(itemTextList);
    }

    @When("the user clicks alternative add to cart icon")
    public void the_user_clicks_alternative_add_to_cart_icon() {
        alternativeAddToCartPage.goToHomePage();
        alternativeAddToCartPage.alternativeAddToCart();
    }

    @Then("the page should automatically goes top of the page and success message should be visible")
    public void the_page_should_automatically_goes_top_of_the_page_and_success_message_should_be_visible() {
        alternativeAddToCartPage.successMessageAssertion();
    }

    @When("the user hover on the my cart icon")
    public void the_user_hover_on_the_my_cart_icon() {
        alternativeAddToCartPage.goToHomePage();
        alternativeAddToCartPage.hoverMyCartIcon();
    }

    @Then("the added item should be seen")
    public void the_added_item_should_be_seen() {
        alternativeAddToCartPage.addedItemVisibilityAsertion();
    }


}
