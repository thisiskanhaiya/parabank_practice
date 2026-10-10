@regression
Feature: Account Overview
  Scenario: Verify customer account are displayed
    Given user opens parabank application
    When user enters valid credentials
    Then account overview page should displayed
    And customer account should be visible