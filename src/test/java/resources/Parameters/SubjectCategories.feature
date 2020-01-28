Feature: Creating Subject Categories

  Scenario: Countries Subject Categories

    Given navigate to website
    And Click on setup , parameters and "Subject Categories"
    And Click on add button
    And Creation two inputs are  "mySubj" , "mys"
    And Click on save button frame
    Then Verify data is created name is "mySubj"


