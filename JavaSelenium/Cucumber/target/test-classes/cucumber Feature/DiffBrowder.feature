@smoke
Feature: check application with different browser
   
  Scenario Outline: user able to launch the application with different browser
  
     Given User launch the Url in "<browser>"
     When enter credentials
     And User click login button
     Then validate user able to access or not
     
     Examples:
    | browser |
    |chrome|
    |Edge|
    |firefox|