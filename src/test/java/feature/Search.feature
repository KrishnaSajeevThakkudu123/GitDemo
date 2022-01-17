Feature: Search and place order for vegetables

@SeleniumTest
Scenario: Search for items and validate results
Given User is on Greenkart Landing Page
When User Searched for "Cucumber" vegetables
Then "Cucumber" results are displayed

@SeleniumTest
Scenario: Search for items and and move to checkout page
Given User is on Greenkart Landing Page
When User Searched for "Brinjal" vegetables
And added the item to cart
And User Proceeded to Checkout page for purchase
Then verify selected "Brinjal" items are displayed in checkout page