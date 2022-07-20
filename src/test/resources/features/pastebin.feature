@pastebin
Feature: pastebin

  Background:
    Given I access the pastebin page

  Scenario: pastebin open
    When I enter a pastebin password sibel
    And I click on the show button
    Then I should be presented with text PASTEBIN_URL