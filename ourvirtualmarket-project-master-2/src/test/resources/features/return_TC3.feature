@return3 @B3VIR2-213
Feature: US 20: Return - TC_3 - Verify that the user notification message is displayed

   #@PRECOND_B3VIR2-170
  Background:
    Given The user on the home page
    When The user close the pop-up
    And The user is on the login page
    When The user should be able to login with valid "beautysworld05@gmail.com" and "12344321"
    And the user has bought a product

  @TEST_B3VIR2-181
  Scenario: Verify user notification message is displayed on successful submission
    Given the user is on the website
    And the user has entered all the necessary information correctly
    When the user clicks the Submit button
    Then the user should see a notification message confirming the successful submission