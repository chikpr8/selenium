Feature: CRM login Feature
Scenario: Free CRM creates a new scenario

Given user is already on Login page

When title of login page is free CRM
Then user enters username and password
|username|Password|
|praveenjairaj66@gmail.com|0123456789|
Then user clicks on login button
Then user is on home page
Then user moves on homeicon
Then user clicks on deals
Then user clicks on new deal
Then user enter deal details
|title|assigned to|Company|products|contacts|amount|commission|stage|
|new contact|praveen kumar|cognizant|assets|9642521109|50|20|Research|


