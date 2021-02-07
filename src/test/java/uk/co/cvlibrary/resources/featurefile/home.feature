@Smoke
Feature: Home Page search functionality

  Scenario Outline: As a user all search functionality fields accessible successfully

    Given I am on home page
    When I enter job title "<keywordfield>"
    And I enter location "<location>"
    And I select distance "<distance>"
    And I handle Iframe
    And I click on more options
    And I enter salary min "<salaryMin>" and "<salaryMax>"
    And I select salary type "<salaryType>"
    And I select job type "<jobType>"
    And I click on find jobs button
    Then I should be able to see result with keyword "<result>"
    Examples:
      | keywordfield | location | distance | salaryMin | salaryMax | salaryType | jobType   | result
      | QA Tester    | Pinner   | 75       | 35000     | 37000     | Per annum  | Permanent | Permanent Qa Tester jobs in Pinner

