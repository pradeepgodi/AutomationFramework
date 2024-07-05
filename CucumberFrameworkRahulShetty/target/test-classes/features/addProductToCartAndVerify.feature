Feature: Search for a product on the Greenkart page , increment the product count , add to the cart and verify on the cart page

@PlaceOrder
 Scenario Outline: Search experience for product on both home and offers page
    Given User is on the Greenkart landing page
    When User searches for a product using the shortname <Name> and views the actual name of the product
    Then Increment the product count by 4 times and add to the cart and Navigates to the checkout page
    And Verifies that same product is listed in the checkout table
    Then enter the promocode <promo> and click on apply button
    

 
   Examples:
		|Name|promo|
		|tom|somecode|
		
