Feature: Product Listings

  Scenario: Viewing Product Details
    Given a user is on the product listings page
    When they click on a product named "Product A"
    Then they should see detailed product information
    And the product should include a description, image, price, and availability

  Scenario: Out of Stock Product
    Given a user is on the product listings page
    When they click on a product named "Product B"
    Then they should see detailed product information
    And the product should include a description, image, price, and show "Out of Stock"

  Scenario: Product Image Zoom
    Given a user is on the product details page
    When they hover over the product image
    Then they should be able to zoom in on the product image

  Scenario: Price Comparison
    Given a user is on the product details page
    When they view the product price
    And they compare it with other similar products
    Then the price should be competitive with similar products

  Scenario: Product Availability Notification
    Given a user is on the product details page
    When they see a product is "Out of Stock"
    And they choose to receive availability notifications
    Then they should receive an email notification when the product is back in stock
