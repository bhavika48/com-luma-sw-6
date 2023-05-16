@Smoke
Feature: Women Test
  As user I want to verify products

  Scenario: Verify the sort by product name filter
    Given I am on Home Page
    When I mouse hover on Women Menu
    And I mouse hover on Tops
    And I click on Jackets
    And I select sort By filter "Product Name"
    Then I verify the products name display in alphabetical order

  Scenario: Verify The sort by price filter
    When I mouse hover on Women Menu
    And I mouse hover on Tops
    And I click on Jackets
    And I Select Sort By filter Price
    Then I should verify the products price display in  Low to High


