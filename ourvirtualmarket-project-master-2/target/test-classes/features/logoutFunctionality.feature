@logout
Feature: Logout Test Set
  Background: logout Directly Test
    Given The user is on the login page
    When The user should be able to login with valid "denemekraft@gmail.com" and "krafttech123"

  @logout1
  Scenario:
    Given The user click the Logout button at the top right corner
    When Verify that title is "Account Logout"
    And Verify that the logout helper texts
    And Verify that the Continue button is visible
    Then The user go back to previous page
    And Verify that Login and Register button is visible and Logout button is not visible
    And Verify that title is not "My Account"

  @logout2
  Scenario: Logout Directly Test - 2
    Given The user click the Logout button at the down right of the page
    When Verify that title is "Account Logout"
    And Verify that the logout helper texts
    And Verify that the Continue button is visible
    Then The user go back to previous page
    And Verify that Login and Register button is visible and Logout button is not visible
    And Verify that title is not "My Account"

  @logout3
  Scenario: Logout Test After add an Item to Cart
    Given The user go to the "Television" module
    And The user select the "Cello C3220G 32\" LED-backlit LCD TV" product
    And The user clicks add to cart button
    And The user close the Added to cart successfully popup
    And The user click the Logout button at the top right corner
    When Verify that title is "Account Logout"
    And Verify that the logout helper texts
    And Verify that the Continue button is visible
    When The user go back to previous page
    When The user hover the My Cart
    Then Verify that My cart is empty
    Then Verify that Login and Register button is visible and Logout button is not visible

  @logout4
  Scenario:  Logout Test When at Shopping Cart
    Given The user go to the "Networking" module
    And  The user hover the "Belkin - Network device mounting bracket" and click the Add to Cart button on the product
    When The user hover the My Cart
    When The user click the View Cart
    And The user click the Logout button at the top right corner
    Then Verify that title is "Account Logout"
    And Verify that the logout helper texts
    And Verify that the Continue button is visible
    When The user go back to previous page
    Then Verify that Shopping cart page is NOT visible
    Then Verify that Login and Register button is visible and Logout button is not visible

  @logout5
  Scenario: Logout Test When at My Account Information Page
    Given Click the "Edit your account information" button
    Given Verify that First Name "deneme", Last Name "kraft", email "denemekraft@gmail.com" and Telephone "5425425425"
    And The user click the Logout button at the top right corner
    When Verify that title is "Account Logout"
    And Verify that the logout helper texts
    And Verify that the Continue button is visible
    When The user go back to previous page
    Then Verify that My Account Information is NOT visible
    And Verify that Login and Register button is visible and Logout button is not visible
