package com.ourvirtualmarket.steps_defs;

import com.ourvirtualmarket.pages.DashboardPage;
import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.pages.WishListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WishList_StepDefs {
    String expectedTitle;
    String actualTitle;
    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();
    WishListPage wishListPage=new WishListPage();

    @When("The User should navigate to Wish List")
    public void the_user_should_navigate_to_wish_list() throws InterruptedException {
        wishListPage.wishListEmpty.click();
        Thread.sleep(1000);
        if (wishListPage.myWishList.contains(wishListPage.removeButton)) {
            wishListPage.cleanItems();
        }


    }
    @Then("The User verify that wish list empty")
    public void the_user_verify_that_wish_list_empty() throws InterruptedException {



        expectedTitle="Your wish list is empty.";
        actualTitle=wishListPage.emptyMessage.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
        wishListPage.market.click();
        Thread.sleep(3000);



    }



}
