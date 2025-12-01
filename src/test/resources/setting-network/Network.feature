@test
Feature: Network scenarios

  Scenario: Network main flow
    When Click setting network and internet
    And Click Data usage
    Then Verify data usage value
