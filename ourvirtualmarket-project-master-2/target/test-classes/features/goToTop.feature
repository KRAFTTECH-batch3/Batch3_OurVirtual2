@B3VIR2-214
Feature: Go to top page with button

  Background: Go to home page
    Given The user on the home page
    And The user close the pop-up
  @TEST_B3VIR2-183
  Scenario: Scenario 1
    Given The user scrolls down the page
    When The user hover the button,text appears Go To Top and click button
    Then Verify that the user top on page
  @TEST_B3VIR2-184
  Scenario:  Scenario-2
    Given The user top on the page
    When The user hover the button,text appears Go To Top and click button
    Then Verify that the user top on page
