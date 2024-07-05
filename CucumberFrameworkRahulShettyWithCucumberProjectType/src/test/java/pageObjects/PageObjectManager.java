package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandinPage lp ;
	WebDriver driver;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public LandinPage getLandingPage() {
		LandinPage lp = new LandinPage(driver);
		return lp;
	}
	
	public OffersPage offersPage() {
		OffersPage offersPage = new OffersPage(driver);
		return offersPage;
	}
	
	public CartPage checkOutPage() {
		CartPage cartPage = new CartPage(driver);
		return cartPage;
	}
	
	
	
}
