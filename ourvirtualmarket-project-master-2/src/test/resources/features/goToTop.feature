@GoToTop
Feature: Go to top page with button

  Background: Go to home page
    Given The user on the home page
    And The user close the pop-up

  Scenario: Scenario 1
    Given The user scrolls down the page
    When The user hover the button,text appears Go To Top and click button
    Then Verify that the user top on page