@cg

Feature: Alternative search button feature

  #@PRECOND_B3VIR2-202
  Background: Go to home page
    Given The user on the home page
    And The user close the pop-up

  @TEST_B3VIR2-206
  Scenario: US 10: [ Search Functionality Alternative Button ] - TC_1 - Validate that alternative button for the search functionality in the middle right is seen and clickable
    When user hover the alternative search button
    And the user click the alternative search button
    Then  the user verify that s/he see the search pop-up
