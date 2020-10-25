Feature: User should be able to login to Game.tv through the twitter option.


@test3 @full
Scenario: Verify that User should be able to login to Game.tv through the twitter option.

		 
		When User lauches the game.tv app
    And User should be able to click Twitter
    And User enters Username and Passowrd
    Then User should be able to login via Twitter and is on Home Page
   