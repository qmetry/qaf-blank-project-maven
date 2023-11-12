Feature: Google Search

  @Smoke
  Scenario: Sample Test
    Given navigate to search page
    When search for 'qaf github infostretch'
    Then verify link with partial text 'qaf' is present