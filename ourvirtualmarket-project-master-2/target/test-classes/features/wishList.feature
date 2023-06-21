Feature: add wish list
  @wishlist
  Scenario: login page
    Given The user is on the login page
    When The user should be able to login with valid "kraft@kraft.com" and "Kraft12345"
    And The User should navigate to Wish List
    Then The User verify that wish list empty

