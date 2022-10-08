Feature: Shopping dresses

Background:
 
 When User enters the Username in username field
 And user enters the Password in password field
 Then User clicks on login button and it navigates to user account page

Scenario:  Casual Dresses purchase
When User clicks on Casual Dresses in the Dresses and it navigates to CasualDresses page
And User chooses the dress and clicks on Quikview
And user selects the Quantity ,size and color
And User clicks on AddToCart button and it shows the pop up of selected items
And User clicks on ProceedToCheckout button and it navigates to summary column in Order Page
And User clicks on ProceedToCheckout button in summary column and it navigates to Address column
And User clicks on ProceedToCheckout button in Address column and it navigates to Shipping column
And User clicks on CheckBox and clicks on ProceedToCheckout button in Shipping column and it navigates to payment column
And User chooses payment type
Then User clicks on Confirm my order button in MyStore page 

Scenario: Summer Dresses purchase
When User clicks on Summer Dresses in the Dresses and it navigates to Summer Dresses page
And User chooses the Dress and clicks on Quikview button
And user selects the quantity,size and colour
And User clicks on AddToCart button and It shows the pop up of selected item
And User clicks ProceedToCheckout button and It navigates to summary column in Order Page
And User clicks ProceedToCheckout button in summary column and It navigates to Address column
And User clicks ProceedToCheckout button in Address column and It navigates to Shipping column
And User clicks CheckBox and clicks on ProceedToCheckout button in Shipping column and It navigates to payment column
And User Selects Payment type
Then User clicks Confirm My Order button in MyStore page 
