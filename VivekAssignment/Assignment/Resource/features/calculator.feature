

Feature: Verification of calculator functionality
	


Scenario: verify that the calculator is working properly
Given User is on Home page
When User select single for Application type
And User select zero dependant
And User enters "80000" for anual income
And User enter "10000" for other anual income
And User enter "500" for lving expenses
And User enter "0" for Current home loan monthly repayment
And User enter "100" for Other loan monthly repayment
And User enter "0" for other commitments
And User enter "10000" for credit card limit
And User click on start over button
And User enter "1" for lving expenses
And user click on borrow button calculator
Then verify the message 


	



