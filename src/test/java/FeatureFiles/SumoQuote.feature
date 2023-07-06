Feature: SumoQuote


  Scenario: Creating new Account
    Given Navigate to the web page
    When I fill up the new account form,tick the checkbox and click on the save button
    And I login the page with valid values
    And I click on get started button
    And I fill up the title page content
    And I click  See my brand button
    And I select my brand
    And I click on brand confirm button
    And I select type of work
    And I click on finish button
    Then I click on Let's Go button

