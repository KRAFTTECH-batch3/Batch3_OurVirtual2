@us_20 @B3VIR2-213
Feature: US 20: Return - As a user, I should be able to create a return request for any product that I bought.

  #@PRECOND_B3VIR2-170 @smoke @regression
  Background:
    Given The user on the home page
    When The user close the pop-up
    And The user is on the login page
    When The user should be able to login with valid "beautysworld05@gmail.com" and "12344321"
    And the user has bought a product

  @return_tc_1 @TEST_B3VIR2-174
  Scenario: Check if "Returns" link is displayed at the bottom of the page
    Given the user visits the website
    When the user scrolls to the bottom of the page
    Then the user should see the "Returns" link

  @return_tc_2 @TEST_B3VIR2-175
  Scenario: Verify auto-filling of fields after clicking "Returns" link
    Given the user is on the website
    When the user clicks on the Returns link
    Then the First Name, Last Name and E-Mail fields should be automatically filled

  @return_tc_3 @TEST_B3VIR2-181
  Scenario: Verify user notification message is displayed on successful submission
    Given the user is on the website
    And the user has entered all the necessary information correctly
    When the user clicks the Submit button
    Then the user should see a notification message confirming the successful submission

  @return_tc_4 @TEST_B3VIR2-182
  Scenario: Error message is displayed when one or more pieces of information are missing
    Given the user form is opened
    When The submit button is clicked even though all the fields that are already empty are left blank.
    Then the error message "Please complete the form below to request an RMA number" is displayed.



