@B3VIR2-213
Feature: US 20: Return - TC_1 - Verify that the "Returns" link that the bottom of the page is displayed.


  Background:
		#@PRECOND_B3VIR2-170
  Background:
    Given The user is on the homepage
    When The user close the pop-up
    And The user is on the login page
    When The user should be able to login with valid "kraft@kraft.com" and "Kraft12345"
    And the user has bought a product

  @TEST_B3VIR2-174
  Scenario: Check if "Returns" link is displayed at the bottom of the page
    Given the user visits the website
    When the user scrolls to the bottom of the page
    Then the user should see the "Returns" link
