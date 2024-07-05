Feature: Application Login

Background:
#		Given setup the entry in DB // this taken care by the hooks
		When launch the browser in config
		Then hit the home page url

	@RegressionTest @NetBanking
  Scenario: User page default login
    Given User is on landing page
    When User login into application with "user" and password 456
    Then Home page is displayed
    And cards are displayed
    
 
@SmokeTest  @RegressionTest  @Mortgage
Scenario: User page default sign up
    Given User is on Practice landing page
    When User signup in the application
    |pradeep|
    |godi|
    |test@gmail.com|
    |991100112|
    Then Home page is displayed
    And cards are displayed

