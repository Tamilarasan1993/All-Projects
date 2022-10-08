Feature: Booking a Hotel in Adactin
	
  Scenario Outline: Login Functionality
  	Given User launch the Application
    When User enters the valid "<Username>" in Username field
    And User enters the valid "<Password>" in Password field
    Then User clicks on login button and it navigates to Adactin.com - Search Hotel
  	Examples:
  	|Username|Password|
  	|Tamil1993|P9EHXF|	
  	
  Scenario Outline: Search Hotel
    When User selects the "<location>" in Location dropdown list
    And User selects the "<Hotel>" in Hotel dropdown list
    And User selects the "<room type>" in Roomtype dropdown list
    And User selects the "<No of Rooms>" in NoOfRooms dropdown list
    And User enters the date "<Check In Date>" in Check In Date field
    And User enters the date "<Check Out Date>" in Check Out Date field
    And User selects the "<No of Adults>" in No of Adults dropdown list
    And User selects the "<No of Children>" in No of Children dropdown list
    Then User clicks on search button and it navigates to Adactin.com - Select Hotel
		Examples:
		|location|Hotel|room type|No of Rooms|Check In Date|Check Out Date|No of Adults|No of Children|	
		|Sydney|Hotel Hervey|Deluxe|2|09/12/2022|10/12/2022|4|1|
		
		Scenario: Select Hotel 
    When User clicks on Radio button
    Then User clicks on Continue button and it navigates to Adactin.com - Book A Hotel
    Scenario: Book a Hotel
    When User enters "<First Name>" in First Name field
    And User enters "<Last Name>" in Last Name field
    And User enters "<Address>" in Address TextArea
    And User enters the "<Card No>" in Card No field
    And User selects the "<Card type>" in Card type dropdown list
    And User selects the "<Expiry Month>" in Expiry Month dropdown list
    And User selects the "<Expiry Year>" in Expiry Year dropdown list
    And User enters the "<CVV>" no in CVV no field
    Then User enters the BookNow button and it navigates to Adactin.com - Hotel Booking Confirmation
	Examples: 
	|First Name|Last Name|Address|Card No|Card type|Expiry Month|Expiry Year|CVV|
	|Tom|Sts|INDIA,CHENNAI|9988776655443322|AMEX|12|2022|373|
	
		
		Scenario: Booking Confirmation
    When User clicks on My Itinerary to check the Booking Confirmation
	    
    