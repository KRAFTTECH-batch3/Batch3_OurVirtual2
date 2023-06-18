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

    @Given("the user is on the website")
    public void the_user_is_on_the_website() {
        alternativeAddToCartPage.goToHomePage();
    }

    @When("the user clicks on the Returns link")
    public void the_user_clicks_on_the_returns_link() {
        BrowserUtils.scrollToElement(returnPage.returnsServiceFromFooterMenu);
        BrowserUtils.clickWithJS(returnPage.returnsServiceFromFooterMenu);
        BrowserUtils.waitFor(3);
    }
    @Then("the First Name, Last Name and E-Mail fields should be automatically filled")
    public void the_first_name_last_name_and_e_mail_fields_should_be_automatically_filled() {
        returnPage.assertTheFieldsShouldBeAutomaticallyFilled();
    }

    @Given("the user has entered all the necessary information correctly")
    public void the_user_has_entered_all_the_necessary_information_correctly() {



    }
    @When("the user clicks the Submit button")
    public void the_user_clicks_the_submit_button() {

    }
    @Then("the user should see a notification message confirming the successful submission")
    public void the_user_should_see_a_notification_message_confirming_the_successful_submission() {

    }





}


