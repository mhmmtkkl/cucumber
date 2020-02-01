Feature: Creating Countries
@SmokeTest
  Scenario: Countries creation

    Given navigate to website
    And Click on setup , parameters and "Countries"
    And Click on add button
    And Creation two inputs are  "country1" , "myc"
    And Click on save button frame
    Then Verify data is created name is "country1"

