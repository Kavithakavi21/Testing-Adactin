Feature: Login functionality for Adactin Application 

Scenario: User enter valid username and password 
	Given User launch application 
	When User enter "Kavithakavi" as username 
	And  User enter "Kavi@21" as password 
	Then User verify valid username and valid password
	
Scenario: User search hotel
    Given User selecting "London" Location
    When User select "Hotel Sunshine" hotel
    And User select "deluxe" Roomtype
    And User enter "1-One" Number of rooms
    And User enter "30/03/2021" as Check In Date
    And User enter "31/03/2021" as Check Out Date
    And User enter "2-Two" Adult per Room
    And User enter "2-Two" Children per Room        
    Then User click on Search Button	