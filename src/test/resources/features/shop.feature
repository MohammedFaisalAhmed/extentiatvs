@UserShopsTVSAccesories&Merchandise
Feature: User shops the TVS Accessories and TVS Genuine Parts

@User1ShopsTVSAccesories&Merchandise
Scenario Outline: User clicks on Shop button, navigates to the shop page , select the product new window will be displayed.
Given User click on Shop button.
When User selects any "<ProductName>" from  Accessories and Merchandise section.
Then New window will be opened 
And User click on Merchandise button

Examples:
|ProductName          |
|TestProduct1         |
|TestProduct2         |


#The Below Code for Cucumber without json and above code with Json

#@UserShopsTVSAccesories&Merchandise
#Feature: User shops the TVS Accessories and TVS Genuine Parts

#@User1ShopsTVSAccesories&Merchandise
#Scenario Outline: User clicks on Shop button, navigates to the shop page , select the product new window will be displayed.
#Given User click on Shop button.
#When User selects any "<ProductName>" from  Accessories and Merchandise section.
#Then New window will be opened 
#And User click on Merchandise button

#Examples:
#|ProductName          |
#|Protection & Security|
#|Style                |


#@UserShopsTVSAccesories&Merchandise1
#Feature: User shops the TVS Accessories and TVS Genuine Parts

#@User1ShopsTVSAccesories&Merchandise1
#Scenario Outline: User clicks on Shop button, navigates to the shop page, cart page and place the order
#Given User click on Shop button.
#When User will be able to see the Shop menu with the Product List.
#Then User selects Accessories and Merchandise from the menu.
#And User selects any "<Products1>"
#And User will be navigated to the another window as per the selected product.
#Then User click on add to cart button
#And Your Cart page will be displayed
#Then User Verify the order
#And Click on Place Order button
#Then user enter all the details and click on Pay now button.

#Examples:
#|Products1                          |
#|TVS Kit Scooter Guard Comfort-Ntorq|
#|TVS CRASH GUARD                    |