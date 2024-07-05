Feature: Application Login

Background:
		Given setup the entry in DB
		When launch the browser in config
		Then hit the home page url

	@RegressionTest
  Scenario: Admin page default login
    Given User is on landing page
    When User login into application with "admin" and password "1234"
    Then Home page is displayed
    And cards are displayed
@RegressionTest
  Scenario: User page default login
    Given User is on landing page
    When User login into application with "user" and password 456
    Then Home page is displayed
    And cards are displayed
    
  @SmokeTest    
    Scenario Outline: Multi User page default login
    Given User is on landing page
    When User login into application with "<username>" and password "<password>"
    Then Home page is displayed
    And cards are displayed
    
    Examples:
    |username|password|
    |debituser|abcd123|
    |credituser|crde123|
    |stockuser|stock123|
  
@SmokeTest  @RegressionTest  
Scenario: User page default sign up
    Given User is on Practice landing page
    When User signup in the application
    |pradeep|
    |godi|
    |test@gmail.com|
    |991100112|
    Then Home page is displayed
    And cards are displayed

