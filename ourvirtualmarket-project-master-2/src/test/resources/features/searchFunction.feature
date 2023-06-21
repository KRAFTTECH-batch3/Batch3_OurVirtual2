@B3VIR2-217
Feature: search function

  Background:
    Given The user on the home page
    And The user close the pop-up

  @TEST_B3VIR2-200
  Scenario:
    Given The search box should appear on the main page
    Then the search text should appear in the search bar

  @TEST_B3VIR2-219
  Scenario:
    Given Any order can be entered in the search bar
    Given the search button should be clicked
    Then the user should be directed to the page where the products related to the given order are found
