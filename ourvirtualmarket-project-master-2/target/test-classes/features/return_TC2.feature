@return2 @B3VIR2-213
Feature: US 20: Return - TC_2 - Verify that the "First Name", "Last Name" and "E-Mail" fields are filled automatically after clicking the "Returns" link.

#@PRECOND_B3VIR2-170
  Background:
    Given The user on the home page
    When The user close the pop-up
    And The user is on the login page
    When The user should be able to login with valid "beautysworld05@gmail.com" and "12344321"
    And the user has bought a product

  @return_tc_2 @TEST_B3VIR2-175
  Scenario: Verify auto-filling of fields after clicking "Returns" link
    Given the user is on the website
    When the user clicks on the Returns link
    Then the First Name, Last Name and E-Mail fields should be automatically filled
