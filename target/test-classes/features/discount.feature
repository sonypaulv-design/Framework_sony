@discount

Feature: checking Discount feature

Scenario Outline: Verify each discount filter
Given user is on Toy&Games page
When user selects discount filter <discount>
Then all displayed products should have discount applied
 Examples:
      |discount|value|
      |10% or more|10|
      |25% or more|25|
      |35% or more|35|
      |50% or more|50|
      |60% or more|60|
      |70% or more|70|

	
	