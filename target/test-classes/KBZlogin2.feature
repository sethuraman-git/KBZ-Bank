Feature: To validate the login functionality in KBZ
Background:
 Given User have to enter into KBZ login page
	
  Scenario: To verify login page using invalid username and empty password
    
    When User have to pass invalid username 
    And User have to click login button
    Then User should be getting alert

   Scenario: To verify login page using empty username and invalid password
   
    When User have to pass invalid password 
    And User have to click login button
    Then User should be getting alert 
    
   Scenario: To verify login page using empty username and valid password
   
    When User have to pass valid password 
    And User have to click login button
    Then User should be getting alert  
    
   Scenario: To verify login page using empty username and empty password
    
    When User have to click login button 
    Then User should be getting alert
    