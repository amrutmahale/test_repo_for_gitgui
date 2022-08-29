

Feature: Login1
 

  Scenario: valided login1 functionality
    Given User launch the chrome browser
    When User open the URL "https://admin-demo.nopcommerce.com/login"
    And User entered the email "admin@yourstore.com" and password as "admin"
    And Click on login button
    Then The page title should be a dashboard "Dashboard / nopCommerce administration"
    And User click on Logout link
    Then the page title should a login page "Your store. Login"
  #  And User close the browser
    
    Scenario Outline: successful login with valid credential
     Given User launch the chrome browser
    When User open the URL "https://admin-demo.nopcommerce.com/login"
    And User entered the email "<email>" and password as "<password>"
    And Click on login button
    Then The page title should be a dashboard "Dashboard / nopCommerce administration"
    And User click on Logout link
    Then the page title should a login page "Your store. Login"
    #And User close the browser
    
    Examples:
     | email  | password | status  |
     |admin@yourstore.com|admin| success |
     |Test@yourstore.com|admin| Fail    | 
    

  
