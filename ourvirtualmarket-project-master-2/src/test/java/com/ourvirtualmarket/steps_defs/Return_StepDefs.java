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
        Driver.get().findElement(By.xpath("//a[text()='View your order history']")).click();
        try {
            String text = Driver.get().findElement(By.xpath("//p[text()='You have not made any previous orders!']")).getText();
            if(text==null) productsPage.buyAProduct();
        }catch (Exception e){
            Assert.assertNotNull(Driver.get().findElement(By.xpath("/html/body/div/div[4]/div/div/div[1]/table/tbody/tr[1]/td[2]")));
        }
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
        returnPage.fillTheReturnForm();
    }
    @When("the user clicks the Submit button")
    public void the_user_clicks_the_submit_button() {
        returnPage.submitBtn.click();
    }

    @Then("the user should see a notification message confirming the successful submission")
    public void the_user_should_see_a_notification_message_confirming_the_successful_submission() {
        returnPage.assertSuccessfulReturnMessage();
    }

    @Given("the user form is opened")
    public void the_user_form_is_opened() {
        BrowserUtils.clickWithJS(dashboardPage.returnsServiceFromFooterMenu);
        BrowserUtils.scrollToElement(returnPage.orderID);
        BrowserUtils.waitFor(3);
    }
    @When("The submit button is clicked even though all the fields that are already empty are left blank.")
    public void the_submit_button_is_clicked_even_though_all_the_fields_that_are_already_empty_are_left_blank() {
        BrowserUtils.clickWithJS(returnPage.submitBtn);
        BrowserUtils.waitFor(3);
        BrowserUtils.scrollToElement(returnPage.orderID);
        BrowserUtils.waitFor(2);

    }
    @Then("the error message {string} is displayed.")
    public void the_error_message_is_displayed(String message) {
        message = "Please complete the form below to request an RMA number.";
        returnPage.assertErrorMessage(message);
    }





}


