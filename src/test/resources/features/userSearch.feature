Feature: Search items

Scenario: Searching for Alexa
  Given the user navigates to "www.amazon.com"
  When Searches for "Alexa"
  And navigates to the second page
  And selects the third item
  Then assert that the item would be available for purchase