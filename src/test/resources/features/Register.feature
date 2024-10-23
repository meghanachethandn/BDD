@register
Feature: User Registeration

Background:
Given User navigate to register account page
# Data table examples
@mandatoryfield @smoke @regression
Scenario: Register with mandatory field
When User enter below details in to the fields
|firstname   |Meghana |
|lastname    |DN |
|email       |meghananateshdn@gmail.com|
|mobilenumber|123456789|
|password    |Admin@123|
|confirmpassword|Admin@123|
And Select privacy police field
And Click on continue button
Then Account should get successfully created

@allfield @smoke @regression
Scenario: Register with all field
When User enter firstname "Meghana" in to firstname field
And User enter lastname "D N" in to lastname field
And User enter e-mail "meghananateshdn@gmail.com" in to email field
And User enter mobile number "123456789" in to telephone field
And User enter password "Admin@123" in to password field
And User enter confirm password "Admin@123" in to confirm password field
And Select Yes for newsletter
And Select privacy police field
And Click on continue button
Then Account should get successfully created

@withoutanyfield @smoke @regression
Scenario: Register without providing any field
When User do not enter details in to any field
And Click on continue button
Then warning message should dispaly for all madatory fields

