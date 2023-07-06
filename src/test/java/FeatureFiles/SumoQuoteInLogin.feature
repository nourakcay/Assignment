Feature: SumoQuote starts with Login

  Scenario: Creating account something
    Given Navigate to the web page
    When I login the page with valid credentials
    And I click on get started button
    And I fill up the title page content
#    Examples:
#      | mail                   | password     |
#      | giliy20770@extemer.com | Malnal1234@@ |