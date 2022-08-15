#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag


Feature: Customers

   @Regression
   Scenario: Search customers By email
    Given User launch chrome browser
    When User open URL "https://admin-demo.nopcommerce.com/login"
    And User enter email as "admin@yourstore.com" and password as "admin"
    And Click login button
    Then User can view Dashboard
    When User click on Customer menu
    And Click on customer menuitem
    And Enter customer Email
    When Click on Search button
    Then User Should found Email in the search table
   # And Close the browser
    
  
    Scenario: Search customers By firstName and lastName
    Given User launch chrome browser
    When User open URL "https://admin-demo.nopcommerce.com/login"
    And User enter email as "admin@yourstore.com" and password as "admin"
    And Click login button
    Then User can view Dashboard
    When User click on Customer menu
    And Click on customer menuitem
    And Enter customer FirstName
    And Enter customer LastName
    When Click on Search button
    Then User Should found firstname and lastname in the search table
    # And Close the browser
 
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
  #  Then I verify the <status> in step

  #  Examples: 
   #   | name  | value | status  |
     # | name1 |     5 | success |
    #  | name2 |     7 | Fail    | 
