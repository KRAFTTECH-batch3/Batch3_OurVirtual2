@B3VIR2-222
Feature: Add to Cart

  Background:
    Given The user is on the login page
    When The user should be able to login with valid "kraft@kraft.com" and "Kraft12345"
    Then The user should be able to see logout button
    When The user clicks on your story to go to the homepage

  @TEST_B3VIR2-187
  Scenario Outline: Add a product to cart
    Given The user is on the homepage
    When The user go to the 'Networking' module
    And The user select the third product
    Then The user should be able to see product details page
    And The user should be able to see "<product name>" and "<price>" and "<availability status>" and "<viewes>"
    And The user should be able to see add to cart button and buy now button next to the product
    When The user clicks add to cart button
    Then The user should be able to see the pop up page about added product
    When The user navigates to shopping cart icon on dashboard page
    Then The user should be able to see added product in the shopping cart
    Examples:
      | product name             | price   | availability status | viewes|
      | ASUS ROG STRIX GS-AX3000 | $156.00 | In Stock            | 504 times|







