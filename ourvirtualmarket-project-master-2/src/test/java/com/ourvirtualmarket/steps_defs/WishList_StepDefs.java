package com.ourvirtualmarket.steps_defs;

import com.ourvirtualmarket.pages.DashboardPage;
import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.pages.WishListPage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static java.lang.Thread.sleep;

public class WishList_StepDefs {
    String expectedTitle;
    String actualTitle;
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    WishListPage wishListPage = new WishListPage();

    @When("The User should navigate to Wish List")
    public void the_user_should_navigate_to_wish_list() throws InterruptedException {
        String w = wishListPage.wishListEmpty.getAttribute("title");
        String expected = "Wish List (0)";
        System.out.println(w.contains(expected));

        System.out.println("id hello :" + wishListPage.wishListEmpty.getAttribute("title"));
        System.out.println(w);


        if (!w.contains(expected)) {
            wishListPage.wishListEmpty.click();
            sleep(3000);

            while (wishListPage.myWishList.contains(wishListPage.removeButton)) {

                wishListPage.removeButton.click();

                sleep(3000);

            }

            wishListPage.market.click();
            sleep(2000);
            dashboardPage.closePopUp();

        }
        wishListPage.market.click();
        sleep(2000);
        dashboardPage.closePopUp();


        BrowserUtils.clickWithJS(wishListPage.addToWish.get(0));
        System.out.println("--------------------------------------------");
        System.out.println(wishListPage.items.get(0).getText());

        sleep(2000);
        BrowserUtils.clickWithJS(wishListPage.addToWish.get(1));
        System.out.println(wishListPage.items.get(1).getText());
        sleep(2000);







    }




}
