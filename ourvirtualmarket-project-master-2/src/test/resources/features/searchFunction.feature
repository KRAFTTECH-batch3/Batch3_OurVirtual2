Feature: search function

  Background:
    Given The search box should appear on the main page.
    Given the 'search' text should appear in the search bar.

    @wip
  Scenario:
    Given Any order can be entered in the search bar
    Given the search button should be clicked
    Then the user should be directed to the page where the products related to the given order are found.