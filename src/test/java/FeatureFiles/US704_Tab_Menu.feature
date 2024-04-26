Feature: Tab Menu functionality
  Background:
    Given user visits the Magento website
    And user clicks on Sign in section
    And user enters valid username and password
    Then user log ins successfully and confirms the log in

  Scenario: the user navigates through the Tab menu sections
    And the user navigates through the TAB menu sections with one level elements:
    And the user navigates through the TAB menu sections with two level elements
    And the user navigates through the TAB menu sections with three level elements
    Then the user verifies that the last pages are opened