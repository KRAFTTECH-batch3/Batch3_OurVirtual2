package com.ourvirtualmarket.steps_defs;

import com.ourvirtualmarket.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AlternativeSearchButton_StepDefs {

    HomePage homePage=new HomePage();

    @When("the user hover the alternative search button")
    public void userHoverTheAlternativeSearchButton() {
    }

    @When("the user click the alternative search button")
    public void the_user_click_the_alternative_search_button() {
        homePage.searchButton.click();
    }

    @Then("^the user verify that s\\/he see the search pop-up$")
    public void the_user_verify_that_s_he_see_the_search_pop_up() {
        Assert.assertTrue(homePage.popSearchButton.isDisplayed());
    }




    @And("the user click the popup search button")
    public void theUserClickThePopupSearchButton() {
        homePage.popSearchButton.click();

    }



    @Then("the user verify that s-he is on the home page")
    public void theUserVerifyThatSHeIsOnTheHomePage() {

        Assert.assertTrue(homePage.homePageHeader.isDisplayed());
    }

    @When("the user click the X button")
    public void theUserClickTheXButton() {

        homePage.popUpCloseButton.click();
    }

    @And("the user enters a product name television in the search bar")
    public void theUserEntersAProductNameTelevisionInTheSearchBar() {
        homePage.popUpSearchButtonField.sendKeys("television");
    }

    @Then("the user is directed to page that having television products")
    public void theUserIsDirectedToPageThatHavingTelevisionProducts() {

        String actual="television";
        String expected=homePage.relatedProductPage.getText();
        Assert.assertEquals(expected,actual);
    }
}
