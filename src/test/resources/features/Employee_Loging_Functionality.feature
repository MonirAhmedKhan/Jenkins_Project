Feature: Employee Login Functionality

  @smoke
  Scenario Outline: Login as a Employee
    Given I am in Landing Home Page
    When I Click on Login
    Then I will be in Login Page
    And Click Employee Login
    Then I enter User Id as "testpilot@gmail.com"
    And I enter Password "1234"
    When I click Login Button
    Then I will see Employee Home Page
