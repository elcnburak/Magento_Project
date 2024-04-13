Feature: Adding /removing items from the shopping cart.
  Background:
    Given user visits the Magento website
    And user clicks on Sign in section
    And user enters valid username and password

  Scenario:Adding /removing items from the shopping cart
    When The user sees a random item and clicks the "Add to Cart" button
    And The item is added to the cart, and a confirmation message is displayed to the user.
    And The user adjusts the quantity of the item
    And To remove an item from the cart
    And The user reviews the contents of the cart and adjusts the quantities if desired using the QTY field.
   Then To apply the changes, the user must click the "Update Shopping Cart" button


