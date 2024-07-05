Feature: Search and Place the order for Products

#"""  Scenario: Search experience for product on both home and offers page
    #Given User is on the Greenkart landing page
    #When User searches for a product using the shortname "tom" and views the actual name of the product
    #Then User searches for the same "tom" shortname in offers page to check if product exists
#		And validate that the product name is same on both the pages
#		"""
		
@Landing
 Scenario Outline: Search experience for product on both home and offers page
    Given User is on the Greenkart landing page
    When User searches for a product using the shortname <Name> and views the actual name of the product
    Then User searches for the same <Name> shortname in offers page to check if product exists
		And validate that the product name is same on both the pages
		
		Examples:
		|Name|
		|tom|
		|beet|