
@CucumberHooks
Feature: Make search on ziper home page

@Regression
Scenario: Test Scenario1
	Given User is on home page
	Then User enter some string in search text box
	And Select item from search list
	Then Click on item
	And Verify searchitem

@Regression
Scenario: Test Scenario2
	Given User is on home page
	Then User enter some string in search text box
	And Select item from search list
	Then Click on item
	And Verify searchitem