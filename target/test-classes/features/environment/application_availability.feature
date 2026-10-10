@environment
Feature: Application Availability
  Scenario: Verify parabank application is available
    Given user opens parabank application
    Then application homepage should displayed
