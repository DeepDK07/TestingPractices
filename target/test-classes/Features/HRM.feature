Feature: User is submitting Orange HRM application

Scenario: User Successfully login to HRm site 

Given User is on login page
When user enters username as "Admin"
When user enters password as "admin123"
Then User click on login button
Then user lands on Homepage
