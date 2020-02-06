Feature: Creating exam
  @SmokeTest1
  Scenario: Exam creation

    Given navigate to website
    And Click on DropdownExam and Setup then Entrance Exams
    And Click on add button
    And Fill the "name" ,"RegStart" , "RegEnd"
    And Click on Academic Period and Choose the period
    And Click on grade level and click on any option
    And Click on save button
    And Click on DropdownExam and Setup then Entrance Exams
    Then Verify Exam "name" is created
    And Delete the exam "name"
    Then Verify Exam "name" is not displayed

