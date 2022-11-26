
@google
Feature: Title of your feature
  I want to use this template for my feature file

  @Googlesearch
  Scenario: Google search the web page
    Given Google search "Google"
    And Enter search url"www.google.com"
    When to ensure that page will open or not
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
