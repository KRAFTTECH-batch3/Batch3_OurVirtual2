
@Regression
Feature: Ourvirtualmarket Alternative Add to cart Functions Tests


  Background:
    Given The user is on the login page
    And The user should be able to login with valid "alvl@gmail.com" and "123Alvl"


  Scenario: Scroll Functionality
    Given the user scrolls down on the page and he or she should reach trending items


  Scenario: Hover On Chosen Item And Add to Cart Function
    Given the user hovers on the chosen product thumbnail
    When the user hovers on every separate shortcut icons on the product thumbnail
    Then the icons texts should be equal to belows
      | Add to cart          |
      | Add to Wish List     |
      | Compare this Product |
      | Quick view           |


  Scenario: Alternative Add to Cart
    When the user clicks alternative add to cart icon
    Then the page should automatically goes top of the page and success message should be visible


  Scenario: Added Item Confirmation
    When the user hover on the my cart icon
    Then the added item should be seen
