	Feature: login
	@Sanity
	Scenario: validate login functionality
    Given User launch chrome browser
    When user open URL "https://admin-demo.nopcommerce.com/login"
    And User enter email as "admin@yourstore.com" and password as "admin"
    And Click login button
    Then page title should be a dashboard "Dashboard / nopCommerce administration"
    When user click on logout link
    Then page  title should be "Your store. Login"
   # And Close the browser
    
  # Scenario outline basically use for DDT Testig purpose with Example Keyword to pass data in the form of table   
 @Regression
 Scenario Outline: Success  login with valid credentials DDT
    Given User launch chrome browser
    When user open URL "https://admin-demo.nopcommerce.com/login"
    And User enter email as "<email>" and password as "<password>"
    And Click login button
    Then page title should be a dashboard "Dashboard / nopCommerce administration"
    When user click on logout link
    Then page  title should be "Your store. Login"
    #  And Close the browser
    

  
   Examples:  #it is execute for two time + first scenario = 3 scenario
    | email | password |
    | admin@yourstore.com |     admin | 
    |test@yourstore.com |    admin | 