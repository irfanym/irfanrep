
Feature: Registration
Registration should be quick anf friendly

Background:
Given user is on HomePage of TestMeApp

@Tag1
Scenario Outline: Successfull Registration
New user should get successfully registered to TestMeApp

Given user chosen for Registration
When user user navigates for Registration
And user enters username "<Username>" 
And user enters Firstname "<Firstname>"
And user enters Lastname "<Lastname>" 
And user enters Password "<Password>"
And user enters Confirm Password "<Confirm Password>"
And user selects gender
And user enters Email "<Email>"
And user enters Mobilenumber "<Mobilenumber>"
And user enters Dob "<Dob>"
And user enters Address "<Address>"
And user selects security question
And user enters Answer "<Answer>"
And user clicks on Registration
Then user should receive a confirmation mail
And user should see personalized greeting meaasge

     Examples:
|Username|Firstname|Lastname|Password|Confirm Password|Email|Mobilenumber|Dob|Address|Answer|
|Jamesbond|james|bond|Password123|Password123|irfan.m4211@gmail.com|7892873837|01/02/1998|India India india|Answer|

@Tag2
Scenario Outline: Login to TestMeApp
A Registered user must be login successfully
Given user chosen for Login
When user navigates for login
And user enters username "<username>"
And user enters Password "<Password>"
And user clicks on login button
Then message displayed as login successfully
Examples:
|username|Password|
|Lalitha|Password123|

@Tag3
Scenario: user moves to cart without addong any item to the cart
Given user has registered into testme app
When user search a perticular product like headphones
And user try to poceed to payment without adding any item to cart
Then TestMe App does not display cart icon
