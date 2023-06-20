

Feature: Alternative search button feature

  #@PRECOND_B3VIR2-202
  Background: Go to home page
    Given The user on the home page
    And The user close the pop-up

  @TEST_B3VIR2-206
  Scenario: Validate that alternative button for the search functionality in the middle right is seen and clickable
    When the user hover the alternative search button
    And the user click the alternative search button
    Then  the user verify that s/he see the search pop-up

  @TEST_B3VIR2-215
  Scenario:The user makes a search through alternative search button, s/he is directed to page that is having related
    When the user hover the alternative search button
    And the user click the alternative search button
    And the user enters a product name "television" in the search bar
    And the user click the popup search button
    Then the user is directed to page that having "television" products
