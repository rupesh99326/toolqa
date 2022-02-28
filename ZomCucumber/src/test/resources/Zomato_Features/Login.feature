Feature: Cart and Checkout feature

Background: User is Logged In
Given Zom_User is on Home Page
@SmokeTest
Scenario Outline: Successfully items add to cart and redirect to payment page
	When Zom_User Navigate to Login PopUp
	And Zom_User enters "<mobilenumber>"
	Then Message displayed Login Successfully
			
	Examples:
		|mobilenumber|
		|8825283705|
@RegressionTest
Scenario Outline: To check Email is successfull Login
Given user is on login1 page
When user clicks on loginbutton1
When user clicks on continue with email
And user enters "<email>"
Then user Click_OTP 

Examples:
		|email|
		|rupesh99326@gmail.com| 
@SmokeTest @RegressionTest
Scenario Outline: To check gmail is successfull Login
Given user is on login2 page
When user click on loginbutton2
When user click on continue with mail
And user enter "<gmailid>"
Then clicks on Next
Examples:
		|gmailid| 
		|rupesh99326@gmail.com|