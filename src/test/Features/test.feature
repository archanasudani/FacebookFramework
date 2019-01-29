@Two
Feature: Chrome Installed

  @a
  Scenario: Chrome Installation
    Given  That the user is navigated to the ChromeBrowser
    When I access facebook url
    Then I see facebook homepage

  @Three
  Scenario: Chrome Installation
    Given  That the user is navigated to the ChromeBrowser
    When I access gmail url
    Then I see gmail homepage

  @a
  Scenario: Chrome Installation
    Given  That the user is navigated to the ChromeBrowser
    When I access amazon url
    Then I see amazon homepage

  @Five
  Scenario: Chrome Installation
    Given  That the user is navigated to the ChromeBrowser
    When I access ebay url
    Then I see ebay homepage

