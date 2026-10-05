Feature: Google Search Functionality
  Scenario: To verify the search functionality
    Given the user is on google search page
    When the user enter selenium java in search bar
    And hit enter
    Then the user will able to see the result