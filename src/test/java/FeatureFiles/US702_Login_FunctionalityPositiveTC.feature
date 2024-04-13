Feature: Login Functionality
Scenario: Login with valid user information
  Given user visits the Magento website
  And user clicks on Sign in section
  And user enters valid username and password
  Then user log ins successfully and confirms the log in