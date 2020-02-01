Feature: Creating Citizenship
@SmokeTest
  Scenario: Citizenship creation

    Given navigate to website
    And Click on setup , parameters and "Citizenships"
    And Click on add button
    And  Creation two inputs are  "Testeristan" , "QA"
    And Click on save button frame
    Then Verify data is created name is "Testeristan"
    And Remove the "<myCity>" from the cities table
    Then Verify "<myCity>" is removed

