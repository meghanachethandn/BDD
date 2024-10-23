@search
Feature: Search functionality

Background:
Given User open search button

@validproduct @smoke @regression
Scenario: Search for valid product
When User enter valid product in to search field
And User click on search button
Then Valid product should get displayed in seach result

@nonexistingproduct @smoke @regression
Scenario: Search for non-existing product
When User enter non-existing product in to search field
And User click on search button
Then proper text informing the user about no product matching should be displayed

@withoutprovidinganyproduct @smoke @regression
Scenario: Search without providing any product
When User do not enter product in to search field
And User click on search button
Then proper text informing the user about no product matching should be displayed

