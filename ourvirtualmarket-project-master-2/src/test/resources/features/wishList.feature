@B3VIR2-220 @regression
Feature:  add wish list
  Background:login page
    Given The user is on the login page
    When The user should be able to login with valid "kraft@kraft.com" and "Kraft12345"
    And The User should navigate to Wish List

  @wishlist   @B3VIR2-186
  Scenario:  Scenario: The User is Items are Removed From Wish List
    Given The User remove items from wish list
    Then The user should verify the wishlist is empty
  @wishlist   @B3VIR2-188
  Scenario:  Scenario: The User add Items to the addToCart
    Given The User should add items to the addToCart
    Then The user should verify the items in the addToCart

