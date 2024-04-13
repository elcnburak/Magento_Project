Feature: Address Addition

  Background:
    Given user visits the Magento website
    And user clicks on Sign in section
    And user enters valid username and password

  Scenario Outline: Address Addition click button

    When The user clicks on the "My Account" link
    And The user clicks on the "Manage Address" link in the Address Book section.
    And They fill in the required fields to add a new address.
      | Street | City     |
     | <Street>| <City>   |
    And Optionally, they mark one of the added addresses as the default billing or shipping address
    And They save the changes and return to the "My Addresses" page.
    Examples:
     | Street | City    |
     | ABC    | Alabama |
     | CDE    | Florida |
     | FGH    | Texas   |
