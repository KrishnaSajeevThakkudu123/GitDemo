Feature: Application Login

Background:
Given Validate Browser
When Browser is triggered
Then Check if browser is started



@RegTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with "krishna" and "test"
Then Home page is populated
And Cards are displayed

@SmokeTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with "nikhil" and "test"
Then Home page is populated
And Cards are displayed

Scenario: Home page default login
Given User is on Netbanking landing page
When User signup with following details
|krishna|sajeev|pindimana|kothamangalam|
Then Home page is populated
And Cards are displayed

Scenario Outline: Home page default login
Given User is on Netbanking landing page
When User login into the application with <UserName> and <Password>
Then Home page is populated
And Cards are displayed

Examples:
|UserName|Password|
|user1	 |Pass1	 	|
|user2	 |Pass2	 	|
|user3	 |Pass3	 	|

