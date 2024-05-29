@adactin 
Feature: Validation on user login logout functionalty in adactionpage
  @login
  Scenario: This the login scenario for adactinpage
    Given User launch the Edge browser
    When user launch the url
    And user enter username
    And user enter passward
    And user  select login button
    Then validate user navigate to booking page or not
  @logout
  Scenario: This is the logout scenario for adactinpage
    Given After login to the page
    When user click logout button
    And validate presence of adactin homepage
