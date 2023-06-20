@negative @return4 @B3VIR2-213
Feature: US 20: Return - TC_4 - Verify that an error message is displayed if one or more pieces of information are missing.


  #@PRECOND_B3VIR2-170
  Background:
    Given The user on the home page
    When The user close the pop-up
    And The user is on the login page
    When The user should be able to login with valid "beautysworld05@gmail.com" and "12344321"
    And the user has bought a product


  @TEST_B3VIR2-182
  Scenario: Error message is displayed when one or more pieces of information are missing
    Given the user form is opened
    When The submit button is clicked even though all the fields that are already empty are left blank.
    Then the error message "Please complete the form below to request an RMA number" is displayed.
