package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	WebDriver driver;
	
	By searchBox =By.cssSelector("#search-field");
	By offerProductName =By.xpath("//tbody/tr/td[1]");

	public OffersPage(WebDriver driver) {
		this.driver=driver;
	}


	public void searchItem(String shortNameOfferPage) {
		driver.findElement(searchBox).sendKeys(shortNameOfferPage);

	}



	public String getProductName() {
		return driver.findElement(offerProductName).getText().trim();
			
	}
	
}
