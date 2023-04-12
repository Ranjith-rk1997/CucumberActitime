@E2E
Feature: Actitime application

  Scenario Outline: Add  new user
    And user should login as "admin" and "manager"
    And user should click on user button
    And user should click on new user button
    And user create user as "<firstname>","<lastname>" and "<email>"
    And user should click on close button
    Then user should logout

@test 
    Examples: 
      | firstname | lastname | email        |
      | rm        | ku       | km@gmail.com |
      | jk        | le       | lo@gmail.com |
