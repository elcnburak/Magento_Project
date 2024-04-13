Feature: Address Addition

  Scenario Outline: Address Addition click button

    Given Navigate to Magento
    When The user clicks on the "My Account" link
    And The user clicks on the "Manage Address" link in the Address Book section.
    And  They click on the "Add New Address" button.
    And They fill in the required fields to add a new address.
      | Street |City|Region|Zip Code|Country|
      | <Street> |<City>|<Region>|<Zip Code>|<Country>|
    And Optionally, they mark one of the added addresses as the default billing or shipping address
    And They save the changes and return to the "My Addresses" page.
    Then Optionally, they edit or delete the added addresses.

    Examples:
      | Street |City|Region|Zip Code|Country|
      | ABC |New York|Alaska|123|United Stated|



