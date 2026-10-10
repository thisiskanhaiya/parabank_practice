@authentication
@smoke
Feature: customer login
  Scenario: verify valid customer login
    Given user opens parabank application
    When user enters valid credentials
    Then account overview page should displayed
