@smoke
Feature: Check login functionality different set of creadentials

  Scenario Outline: User able to login with different username and passward
    Given User launch the Url
    When user enter the "<username>" "<passward>" credentials
    And user  click login button
    Then validate user enter page in initial page or not
    
  
    Examples: 
      |username|passward|
      | Malathi150 |       12334 |
      | Malathi    | Airmech03s* |
      | Malathi150 | Airmech03s* |
      | Malath     | Airmech03s* |

