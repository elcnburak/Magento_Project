Feature: Product Ordering from the shopping cart.
  Background:
    Given user visits the Magento website
    And user clicks on Sign in section
    And user enters valid username and password

  Scenario:Product Ordering from the shopping cart.
    When The user sees a random item and clicks the "Add to Cart" button
    And The item is added to the cart, and a confirmation message is displayed to the user.
    And The user clicks the shopping cart and proceed to checkout button
    And The user select shipping address and shipping method
    And The user confirm the order

