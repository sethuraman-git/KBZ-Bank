Feature: To validate login functionality in KBZ Bank webpage

Background:
 Given User have to enter into the KBZ bank login page
	
  Scenario: To verify login page using invalid username and invalid password
    
    When User have to pass invalid username in the field
    And User have to pass invalid password in the field
    And User have to click the login button
    Then User should be getting the alert

  Scenario: To verify login page using invalid username and valid password
    
    When User have to pass invalid username in the field
    And User have to pass valid password in the field
    And User have to click the login button
    Then User should be getting the alert  
    
  Scenario: To verify the login page using username without @ and invalid password
    
    When User have to pass username without @
    And User have to pass invalid password in the field
    And User have to click the login button
    Then User should be getting alert message
    
  Scenario: To verify the login page using username without .com and invalid password
    
    When User have to pass username without .com at the end
    And User have to pass invalid password in the field
    And User have to click the login button
    Then User should be getting alert message 