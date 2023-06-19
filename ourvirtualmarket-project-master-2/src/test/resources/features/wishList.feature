Feature: add wish list
  @wishlist
  Background:login page
    Given The user is on the login page
    When The user should be able to login with valid "kraft@kraft.com" and "Kraft12345"
    And The User should navigate to Wish List


    Scenario:  Scenario: The User is Items are Removed From Wish List
      Given The User remove items from wish list
      Then The user should verify the wishlist is empty

