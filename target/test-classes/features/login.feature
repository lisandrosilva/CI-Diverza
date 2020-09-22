Feature: Application Login

Scenario: Home page default login
Given Initialize the browser with FireFox
And Navigate to "https://portalqa.diverza.com"
Then User login into application with "lisandro.silva" and "Diverza1*"
And  Verify that user is succesfully logged in
Then Verify products are displayed
Then Log Out 
Then Close Browser
