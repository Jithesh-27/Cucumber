Feature: Login functionality 
  Scenario: verify the login functionality
    Given user is on login page
    When user enter valid username
    And user enter valid password
    And user clicks on login
    Then user should able to logged in successfully