Feature: Create a Country
  Scenario:  Country Creating

    Given navigate to website
    And Click on setup , parameters and "Fees"
    And Click on add button
    And Type the name
    And Type the Code
    And Type the Integration Code
    And Type the Priority
    And Click on save button frame
    Then Verify data is created name is "country1"
    And Remove the data "CucumberCountry"
    Then Verify data is removed "CucumberCountry"




