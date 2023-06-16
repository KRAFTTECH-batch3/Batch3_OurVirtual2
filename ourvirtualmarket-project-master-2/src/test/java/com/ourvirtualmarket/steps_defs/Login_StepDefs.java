package com.ourvirtualmarket.steps_defs;

import com.ourvirtualmarket.pages.DashboardPage;
import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        dashboardPage.closePopUp();
        dashboardPage.loginButton.click();
    }

    @When("The user should be able to login with valid {string} and {string}")
    public void the_user_should_be_able_to_login_with_valid_and(String email, String password) {
        loginPage.login(email, password);
        BrowserUtils.clickWithJS(loginPage.loginBtn);
    }

    @Then("The user should be able to see logout button")
    public void the_user_should_be_able_to_see_logout_button() {
        String actualText = dashboardPage.logoutButton.getText();
        Assert.assertEquals("Logout", actualText);
    }

    @When("The user clicks on your story to go to the homepage")
    public void the_user_clicks_on_your_story_to_go_to_the_homepage() {
        dashboardPage.yourStoreBtn.click();
    }


}
