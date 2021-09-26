Feature: Verify that the J.P. Morgan logo is shown

  Scenario Outline: Verify that the first result returned by Google shows J.P. Morgan logo
    Given User open the Google on the browser
    When User pass the search input as "<user_input>" and cliks on google serach button
    And User click on first result returned by Google
    Then User should be also to see the J.P. Morgan logo

    Examples: 
      | user_input   | 
      | J. P. Morgan | 
