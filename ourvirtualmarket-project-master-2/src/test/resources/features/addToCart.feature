Feature: Add to Cart

  Background:
    Given The user is on the login page
    When The user should be able to login with valid "kraft@kraft.com" and "Kraft12345"
    Then The user should be able to see logout button
    When The user clicks on your story to go to the homepage

  @wip
  Scenario: Add a product to cart
    Given The user is on the homepage
    When The user go to the Networking module
    And The user select the third product
    Then The user should be able to see product details page
    And The user should be able to see product name, price, availability status, and views
    And The user should be able to see add to cart button and buy now button next to the product
    When The user clicks add to cart button
    Then The user should be able to see the pop up page about added product
    When The user navigates to shopping cart icon on dashboard page
    Then The user should be able to see added product in the shopping cart





