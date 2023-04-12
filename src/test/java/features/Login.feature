@Sanity
Feature: Actitime application 

@smoke
Scenario: Login should be success
And user enters the username as "admin"
And user entered the password as "manager"
When user click the login button
Then login should be success
Then user should click the logout button

@reg
Scenario: Login should be fail
And user enters the username as "admi"
And user entered the password as "manag"
When user click the login button
But login should fail

@reg
Scenario: Login should be fail
And user enters the username as "adm"
And user entered the password as "man"
When user click the login button
But login should fail
