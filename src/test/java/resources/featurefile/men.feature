Feature: Men Test
  As a user I want to add products in shopping cart

@Sanity
  Scenario: User should add product successFully to shoppingCart
    When I mouse hover on Men Menu
    And I mouse Hover on Bottoms
    And I click on Pants
    And I mouse Hover on product name
    And  Cronus Yoga Pant and click on size "32"
    And I mouse hover on product name Cronus Yoga Pant and click on colour  Black.
    And I mouse Hover on product name
    And  I 'Cronus Yoga Pant' and click on colour Black.
    And  I mouse Hover on product name 'Cronus Yoga Pant' and click on Add To Cart button
    And I verify the text 'You added Cronus Yoga Pant to your shopping cart'
    And I click on 'shopping cart' Link into message
    And I verify the text 'Shopping Cart'
    And I verify the product name 'Cronus Yoga Pant'
    And I verify the product size ‘32’
    Then I verify the product colour ‘Black’
