Feature: Calculator

  Scenario Outline: Addition of two numbers
    Given I have entered the first number <num1>
    And I have entered the second number <num2>
    When I press add
    Then The result is <result>

    Examples:
      | num1 | num2 | result |
      | 10   | 4    | 14     |
      | 1    | 1    | 2      |
      | 7    | 3    | 10     |
      | 0    | 0    | 0      |