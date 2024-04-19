Feature: Wish list add
  Background:
    Given user visits the Magento website
    And user clicks on Sign in section
    And user enters valid username and password

  Scenario:Wish list add
    When The user sees a random item and clicks the "Add to wish list" button
    And The item is added to the wish list, and a confirmation message is displayed to the user.
    And The user click my account and My favorite button
    And The user delete the favorite product in the wish list
    And The item is deleted to the wish list, and a confirmation message is displayed to the user.