
Feature: User login
  Scenario: To check if the User can login with valid credentials

Given user launches web browser
  And maximise the automation window
  Then user is on the home page
  Then User navigates to the login page
  Then User enters a valid user email id
  Then User enters a valid user password associated the email id
  And User clicks on Login
  Then User logins to the system successfully
  And Finally User closes the browser