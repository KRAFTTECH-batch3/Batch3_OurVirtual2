@B3VIR2-225
Feature: US 16: Quick View


  @QuickViewTC1 @TEST_B3VIR2-192
  Scenario: TC_01 Quick View _ hovers the mouse over any product, the "Quick View" button appears automatically.
    Given the user hovers the mouse over any product
    Then the "Quick View" button appears automatically


  @QuickViewTC2 @TEST_B3VIR2-193
  Scenario: TC_02_the user clicks on "Quick view", pop up appears
    Given the user clicks on "Quick view"
    Then a pop-up appears that has details of the product


  @QuickViewTC3 @TEST_B3VIR2-194
  Scenario: TC_03_Clicks on the "Add To Cart" button

    Given the user clicks on the "Add To Cart" button
    Then the item is added successfully and the total cost is shown to the customer correctly.

  @QuickViewTC4 @TEST_B3VIR2-195
  Scenario: TC_04_ total cost is changed correctly at the right top of the home page

  Given the user goes to the top of the home page
  Then the total cost is changed correctly
