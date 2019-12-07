Feature:   As a user I should be able to open the web page and place a order
#Author: Ahm Raihan Uddin
#Date:11/23/2019
#Exam

#Scenario: Verify User are able to Nevigate the homepage 
#	Given  User Click on Menu button
#	When User Click on Check out button 
#	Then User Fill up all the information file
#	And User Click on Place order button

Scenario Outline: Verify payment functionalities
Given User navigae to pracvticeselenium webpage
When User click on manu button
Then User verify the green tea text 
Then User click on checkout button
And user fillup customer "<email>" and "<name>" and "<address>"
Then payment information
And Click the place order button




Examples:
|email|name|address|
|abc@gmail.com|raihan|111 Mave|
|def@gmail.com|haque|112Mave|
