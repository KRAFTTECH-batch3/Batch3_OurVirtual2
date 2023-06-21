package com.ourvirtualmarket.steps_defs;

import com.ourvirtualmarket.pages.SearchFunctionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SearchFunction_StepDefs {

    SearchFunctionPage searchFunctionPage=new SearchFunctionPage();
    @Given("The search box should appear on the main page")
    public void theSearchBoxShouldAppearOnTheMainPage() {
        Assert.assertTrue(searchFunctionPage.searchBoxAppear.isDisplayed());

    }

    @Then("the search text should appear in the search bar")
    public void theSearchTextShouldAppearInTheSearchBar() {
        Assert.assertTrue(searchFunctionPage.searchText.isDisplayed());
    }
        @Given("Any order can be entered in the search bar")
    public void anyOrderCanBeEnteredInTheSearchBar() {
        searchFunctionPage.searchBoxAppear.sendKeys("TV");
    }
    @Given("the search button should be clicked")
    public void theSearchButtonShouldBeClicked() {
        searchFunctionPage.searchBoxButton.click();
    }

    @Then("the user should be directed to the page where the products related to the given order are found")
    public void theUserShouldBeDirectedToThePageWhereTheProductsRelatedToTheGivenOrderAreFound() {
        String actualOrderText="TV";
        String expectedOrderText=searchFunctionPage.searchOrderText.getAttribute("value");
        Assert.assertEquals(actualOrderText,expectedOrderText);
    }


}
