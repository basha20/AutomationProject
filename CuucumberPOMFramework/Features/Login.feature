#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@LoginFeature
Feature: Login functionality validation

  @LoginScenario1
  Scenario: Login Test1
    Given Open application url
    When Enter user name and password
    Then User can able to verify home page

  @LoginScenario2
  Scenario Outline: Login Test1
    Given Open application url
    When Enter user name "<UserName>" and password "<Password>"
    Then User can able to verify home page
    And Close the brower

    Examples: 
      | UserName  | Password  |
      | testuser1 | Password1 |
      | testuser2 | Password2 |
      | testuser3 | Password3 |
      | testuser4 | Password4 |
