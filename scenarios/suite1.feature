Feature: Google Search

  @Smoke
  Scenario: Sample Test
    Given get '/'
    When search for 'qaf github infostretch'
    Then verify link with partial text 'qaf' is present