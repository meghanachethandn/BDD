Feature: User Login
Registered user should be able to login to access account details.

Background: 
Given User Navigate to login page

@login @validcredentials @smoke @regression 
Scenario Outline: Login with valid Credentials
When User enter valid username <username>
And User enter valid password <password>
And Click on login button
Then User should login successfully
Examples:
|username|password |
|Admin	 |Admin@123|
|Admin123|Admin@1  |
|user    |User@123 |

@login @invalidcredentials @smoke @regression
Scenario: Login with invalid Credentials
When User enter invalid username "Admin1"
And User enter invalid password "Admin1234"
And Click on login button
Then User should get proper warning message  

@login @invalidpassword @smoke @regression
Scenario: Login with valid username and invalid password
When User enter valid username "Admin"
And User enter invalid password "Admin@123"
And Click on login button
Then User should get proper warning message

@login @invalidusernamevalidpassword @smoke @regression
Scenario: Login with invalid username and valid password
When User enter invalid username "Admin1"
And User enter valid password "Admin@123"
And Click on login button
Then User should get proper warning message

@login @withoutcredentials
Scenario: Login with out providing any credentials
When User dont enter any credentials 
And Click on login button
Then User should get proper warning message