Feature: Test login functionality
  
  Scenario|: Check login is successful with valid credintials
    Given browser is open
    And User is on login page
    When User enteres Username and Password
    And user user clicks on login
    Then user is navigated to the home page

  Scenario Outline: Check login is successful with valid credintials
    Given browser is open
    And User is on login page
    When User enteres <Username> and <Password>
    And user user clicks on login
    Then user is navigated to the home page

    Examples: 
      | Username | Password    |
      | student  | Password123 |
