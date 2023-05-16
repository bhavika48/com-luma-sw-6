@Regression
Feature: Gear Test

  As a user I want to add products into shopping cart


  Scenario: User should add product successFully to Shopping Cart
    When I mouse Hover on Gear Menu
    And I click on Bags
    And I click on Product Name 'Overnight Duffle'
    And I verify the text 'Overnight Duffle'
    And I Change Qty 3
    And Iclick on 'Add to Cart' Button
    And I verify the text You added Overnight Duffle to your shopping cart'
    And I click on 'shopping cart' Link into  message
    And I verify the product name Cronus Yoga Pant
    And I verify the Qty is '3'
    And I verify the product price $135.00 of overnightDuffle
    And I Change Qty to '5'
    And I click on 'Update Shopping Cart' button
    Then I verify the product price ‘$225.00’