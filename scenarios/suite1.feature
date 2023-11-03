Feature: Google Search

  @Smoke
  Scenario: Sample Test
    Given get '/'
    And reject all cookies
    When search for 'qaf github infostretch'
    Then verify link with partial text 'qaf' is present