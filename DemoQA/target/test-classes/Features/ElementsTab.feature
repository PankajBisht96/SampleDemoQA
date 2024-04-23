Feature: Validate Elements Page

  Background: 
    Given demoQA URL is launched
    And User is on home page
    When User navigates to Elements page

  Scenario: Verify Elements Page is loaded
    Then verify user is navigated to Elements page
#
  #Scenario: Verify Textbox tab functionality
    #And Clicks on Textbox tab
    #And Adds details and submit
    #Then Entered values are saved susccessfully
    
  #Scenario Outline: Incorrect credentials
    #Given User is on login page
    #When User enters <Login Id> and <Password>
    #And Clicks on Login button
    #Then User is successfully logged in
      #| User1 | Pass1 |
