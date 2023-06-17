Feature: QuickView


  Background:
    Given The user should log in and land on the home page.
    Given There should be at least one product in the shopping cart list.

  Scenario:
    Given the user hovers the mouse over any product
    Then the "Quick View" button appears automatically


  Scenario:
    Given the user clicks on "Quick view"
    Then a pop-up appears that has details of the product


  Scenario:
    Given the user clicks on the "Add To Cart" button
    Then the item is added successfully and the total cost is shown to the customer correctly

  @wip
  Scenario:
     Given : the user goes to the top of the home page
      Then : the total cost is changed correctly

