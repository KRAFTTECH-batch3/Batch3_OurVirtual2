package com.ourvirtualmarket.steps_defs;

import com.ourvirtualmarket.pages.DashboardPage;
import com.ourvirtualmarket.pages.GoToTopPage;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class GoToTop_StepDefs {
    DashboardPage dashboardPage=new DashboardPage();
    GoToTopPage goToTopButtonPage=new GoToTopPage();
    @Given("The user on the home page")
    public void theUserOnTheHomePage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @And("The user close the pop-up")
    public void theUserCloseThePopUp() {
        dashboardPage.closePopUp();
    }

    @Given("The user scrolls down the page")
    public void theUserScrollsDownThePage() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    @When("The user hover the button,text appears Go To Top and click button")
    public void theUserHoverTheButtonTextAppearsGoToTopAndClickButton() {
        goToTopButtonPage.hoverGoToTop.click();
    }
    @Then("Verify that the user top on page")
    public void verifyThatTheUserTopOnPage() {
        Assert.assertTrue(dashboardPage.loginButton.isDisplayed());
    }

}
