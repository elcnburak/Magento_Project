Feature: Wish list add
  Background:
    Given user visits the Magento website
    And user clicks on Sign in section
    And user enters valid username and password

  Scenario:Wish list add
    When The user search the product with SKU number
    And The user see the product and click it
    And The user click on menu link for the product
    And The user see prodcut SKU number
    Then The user check the product SKU number

