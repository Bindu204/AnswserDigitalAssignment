Feature: Login,Scroll and Keypress Validation

Background: Launch the application URL
Given the application URL

Scenario: Login validation with valid credentials
When the user click on Form Authentication on Menu
Then the user enter username and password
And the user click on Login button
Then the login should be successfull
When the user click on logout button
Then the logout should be successfull
 
Scenario: Login validation with correct username and wrong password
When the user click on Form Authentication on Menu
Then the user enter correct username and wrong password 
And the user click on Login button
Then the system should throw error message as invalid password

Scenario: Login validation with wrong username and correct password
When the user click on Form Authentication on Menu
Then the user enter wrong username and correct password
And the user click on Login button
Then the system should throw error message as invalid username

Scenario: Infinite scroll validation
When the user click on Infinite scroll on Menu
Then the user scroll to the bottom of the page twice
And the user scroll back to the top of the page
Then the user should validate the Infinite Scroll text

Scenario: Keypress Validation
When the user click on Key presses on Menu
When the user click on DOWN button on keyboard
Then the user should validate the dispalyed text of DOWN 
When the user click on CONTROL button on keyboard
Then the user should validate the dispalyed text of CONTROL 
When the user click on ALT button on keyboard
Then the user should validate the dispalyed text of ALT 
When the user click on SPACE button on keyboard
Then the user should validate the dispalyed text of SPACE 



