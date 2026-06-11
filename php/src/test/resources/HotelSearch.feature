Feature: Hotel Search

Scenario: Search Available Hotels

Given User opens hotel search page

When User enters destination

And User selects checkin date

And User selects checkout date

And User selects travellers count

And User clicks search

Then Validate search results