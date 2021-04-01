Feature: Login functionality for Adactin Application 

Scenario: User enter valid username and password 
	Given User launch application 
	When User enter "Kavithakavi" as username 
	And  User enter "Kavi@21" as password 
	Then User verify valid username and valid password 
	
Scenario: User search hotel 
	Given User selecting "London" Location 
	When User select "Hotel Sunshine" hotel 
	And User select "Deluxe" Roomtype 
	And User enter "1" Number of rooms 
	And User enter "30/03/2021" as Check In Date 
	And User enter "31/03/2021" as Check Out Date 
	And User enter "2" Adult per Room 
	And User enter "2" Children per Room 
	Then User click on Search Button 
	
Scenario: User Select Hotel 
	When User checked the selected hotel 
	Then User click on continue Button 
	
Scenario: User booked a hotel 
	When User enter "Kavitha" as first name 
	And User enter "Suresh" as last name 
	And User enter "12,Thiru nagar,vadapalani" as billing address 
	And User enter "1234567891234567" as credit card no 
	And User select "MAST" as Credit Card Type 
	And User select "10" as Expiry date 
	And User select "2022" as Expiry  year 
	And User select "123" as CVV Number 
	Then User click on Book now 
        