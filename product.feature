Feature: Product Organization by Categories

  Scenario: Creating Categories
    Given a user is logged in as an admin
    When they create a category with the name "Interior"
    And they create a category with the name "Exterior"
    And they create a category with the name "Electronics"
    Then the categories "Interior," "Exterior," and "Electronics" should exist

  Scenario: Adding Products to Categories
    Given a user is logged in as an admin
    And the categories "Interior" and "Exterior" exist
    When they add a product named "Sofa" to the "Interior" category
    And they add a product named "Car" to the "Exterior" category
    Then the products "Sofa" and "Car" should be in their respective categories

  Scenario: Viewing Products by Category
    Given a user is logged in
    And the categories "Interior," "Exterior," and "Electronics" exist
    When they select the "Interior" category
    Then they should see the product "Sofa"
    And they should not see the product "Car"
