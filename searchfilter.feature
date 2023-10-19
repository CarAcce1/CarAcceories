Feature: Search and Filter Products

  Scenario: Searching for a Product
    Given a user is on the product listings page
    When they enter "Product A" in the search bar
    And they press the "Search" button
    Then they should see a list of products matching "Product A"

  Scenario: Filtering Products by Category
    Given a user is on the product listings page
    When they select the "Electronics" category from the category filter
    Then they should see a list of products in the "Electronics" category

  Scenario: Applying Price Filter
    Given a user is on the product listings page
    When they set a price range filter from $50 to $100
    Then they should see a list of products within the price range

  Scenario: Sorting Products by Price
    Given a user is on the product listings page
    When they choose to sort products by price in ascending order
    Then the products should be displayed from the lowest to the highest price

  Scenario: Clearing Filters
    Given a user is on the product listings page with applied filters
    When they click the "Clear Filters" button
    Then all applied filters should be reset, and the complete product list should be displayed
