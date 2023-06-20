package com.ourvirtualmarket.steps_defs;

import com.ourvirtualmarket.pages.AccountLogoutPage;
import com.ourvirtualmarket.pages.DashboardPage;
import com.ourvirtualmarket.pages.MyAccountPage;
import com.ourvirtualmarket.pages.ProductsPage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Logout_StepDefs {
    DashboardPage dashboardPage=new DashboardPage();
    AccountLogoutPage logoutPage = new AccountLogoutPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    ProductsPage productsPage = new ProductsPage();

    SoftAssertions softAssertions = new SoftAssertions();
    @Given("The user click the Logout button at the top right corner")
    public void click_the_logout_button_at_the_top_right_corner() {
       // dashboardPage=new DashboardPage();
        dashboardPage.logout();
    }
    @When("Verify that title is {string}")
    public void verify_that_title_is(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        //Assert.assertEquals(expectedTitle,actualTitle);
    softAssertions.assertThat(actualTitle).isEqualTo(expectedTitle);
    }
    @When("Verify that the logout helper texts")
    public void verify_that_the_logout_helper_texts() {
       // logoutPage =new AccountLogoutPage();
        String expectedHelperText1 = "You have been logged off your account. It is now safe to leave the computer.";
        String expectedHelperText2="Your shopping cart has been saved, the items inside it will be restored whenever you log back into your account.";
        String actualHelperText1 = logoutPage.helperText1.getText();
        String actualHelperText2= logoutPage.helperText2.getText();
        softAssertions.assertThat(actualHelperText1).isEqualTo(expectedHelperText1);
        softAssertions.assertThat(actualHelperText2).isEqualTo(expectedHelperText2);
//        Assert.assertEquals(expectedHelperText1,actualHelperText1);
//        Assert.assertEquals(expectedHelperText2,actualHelperText2);


    }
    @When("Verify that the Continue button is visible")
    public void verify_that_the_button_is_visible() {
       // logoutPage =new AccountLogoutPage();
        softAssertions.assertThat(logoutPage.continueButton.isDisplayed());
        softAssertions.assertAll();
       // Assert.assertTrue(logoutPage.continueButton.isDisplayed());
        BrowserUtils.waitFor(1);

    }
    @Then("The user go back to previous page")
    public void go_back_to_previous_page() {
       // logoutPage =new AccountLogoutPage();
        logoutPage.goBackPreviousPage();
    }
    @Then("Verify that Logout button is Not visible")
    public void verify_that_and_button_is_visible_and_button_is_not_visible() {
      //  dashboardPage= new DashboardPage();
        JavascriptExecutor jse =(JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,-700)");
        BrowserUtils.waitFor(1);
//       softAssertions.assertThat(dashboardPage.loginButton.isDisplayed());
//        softAssertions.assertThat(dashboardPage.registerButton);
//        //Assert.assertFalse(dashboardPage.logoutButton.isDisplayed());
//        //Assert.assertFalse(dashboardPage.registerButton.isDisplayed());

        softAssertions.assertThat(dashboardPage.logoutButton.isDisplayed()).isFalse();
        softAssertions.assertAll();


       // BrowserUtils.verifyElementNotDisplayed(By.xpath("//a[text()=' Logout ']"));



    }
    @Then("Verify that title is not {string}")
    public void verify_that_title_is_not(String title) {
        String actualTitle = Driver.get().getTitle();
       // Assert.assertNotEquals(title, actualTitle);
        softAssertions.assertThat(actualTitle).isNotEqualTo(title);

    }


    @Given("The user click the Logout button at the down right of the page")
    public void clickTheLogoutButtonAtTheDownRightOfThePage() {
       // myAccountPage =new MyAccountPage();
        JavascriptExecutor jse =(JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,500)");
        BrowserUtils.waitFor(1);

        //  BrowserUtils.clickWithJS(myAccountPage.alternativeLogoutButton);
        myAccountPage.alternativeLogoutButton.click();
    }

    @Given("The user go to the {string} module")
    public void theUserGoToTheModule(String tab) {
       // dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule(tab);
    }

    @And("The user select the {string} product")
    public void theUserSelectTheProduct(String productName) {
        //productsPage = new ProductsPage();
        productsPage.navigateToProduct(productName);

    }

    @Then("Verify that My cart is empty")
    public void verifyThatMyCartIsEmpty() {
        WebElement element = Driver.get().findElement(By.xpath(
                "//p[@class='text-shopping-cart']/../../../following-sibling::*"));
        String actualText= element.getText();
        String expectedText = "Your shopping cart is empty!";
        //Assert.assertEquals(expectedText,actualText);
        softAssertions.assertThat(actualText).isEqualTo(expectedText);
    }
    @Then("Verify that Shopping cart page is NOT visible")
    public void verifyThatShoppingCartPageIsNOTVisible() {
        WebElement element = Driver.get().findElement(By.cssSelector("[class='table-responsive']"));
        //Assert.assertFalse(element.isDisplayed());
        softAssertions.assertThat(element.isDisplayed()).isFalse();

    }

    @Given("Click the {string} button")
    public void clickTheButton(String tab) {
      // myAccountPage =new MyAccountPage();
       myAccountPage.navigateToLeftTabs(tab);
    }

    @Given("Verify that First Name {string}, Last Name {string}, email {string} and Telephone {string}")
    public void verifyThatFirstNameLastNameEmailAndTelephone(String expectedFirstName, String expectedLastName,
                                                             String expectedEmail, String expectedTelephone) {
        //myAccountPage =new MyAccountPage();
        String actualFirstName = myAccountPage.firstNameInputBox.getAttribute("value");
        String actualLastName = myAccountPage.lastNameInputBox.getAttribute("value");
        String actualEmail = myAccountPage.emailInputBox.getAttribute("value");
        String actualTelephone = myAccountPage.telephoneInputBox.getAttribute("value");
        Assert.assertEquals(expectedFirstName,actualFirstName);
        Assert.assertEquals(expectedLastName,actualLastName);
        Assert.assertEquals(expectedEmail,actualEmail);
        Assert.assertEquals(expectedTelephone,actualTelephone);
    }

    @Then("Verify that My Account Information is NOT visible")
    public void verifyThatMyAccountInformationIsNOTVisible() {
       // myAccountPage =new MyAccountPage();
   //     Assert.assertFalse(myAccountPage.personalDetailForm.isDisplayed());
        softAssertions.assertThat(myAccountPage.personalDetailForm.isDisplayed()).isFalse();
    }
}
