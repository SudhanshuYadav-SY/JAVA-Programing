
Feature: User searches for a valid product
  Scenario: To check if the User can login with valid credentials and then search for a product

    Given user launch web browser
    Then User opens home page
    Then User logs in using valid credentials
    Then User search a valid product