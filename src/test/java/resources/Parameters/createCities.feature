Feature: Creating city

  Scenario Outline: City creation

    Given navigate to website
    And Click on setup , parameters and "Cities"
    And Click on add button
    And Create an city as name is "<myCity>" , click on country dropdown and click on country "<country1>"
    And Click on save button frame
    Then Verify data is created name is "<myCity>"
    And Remove the "<myCity>" from the cities table
    Then Verify "<myCity>" is removed

    Examples:
      |Cities|myCity|country1|
      |Cities|myCity1|country1|
      |Cities|myCity2|country1|
      |Cities|myCity3|country1|



