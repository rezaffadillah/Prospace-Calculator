@Calculator
Feature: Factorial Calculator

  Background:
    Given User is on the Prospace Factorial Calculator

  Scenario: Calculate by clicking on the Calculate button
    When User enters an integer on the text field
    And User clicks on the Calculate button
    Then The result should be displayed

  Scenario: View Terms & Conditions page
    When User clicks on the Terms & Conditions link
    Then The Terms & Conditions should be displayed

  Scenario: View Privacy page
    When User clicks on the Privacy link
    Then The Privacy should be displayed