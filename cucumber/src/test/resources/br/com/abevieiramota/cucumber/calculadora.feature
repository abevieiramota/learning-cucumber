@start
Feature: Calculadora
    As a bereu
    In order to calculate my calories intake
    I want to calculate the product of his weight and calories per kg
 
Scenario: Calculate calories intake
    Given the bereu enters his weight 78KG
    When the bereu executes calculate
    Then the system must show 1560Kcals
