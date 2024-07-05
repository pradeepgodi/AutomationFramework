package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandinPage {
	
	WebDriver driver;
	
	public LandinPage(WebDriver driver) {
		this.driver=driver;
	}

	By searchBox = By.cssSelector(".search-keyword");
	By searchBtn= By.cssSelector(".search-button");
	By productName = By.cssSelector("h4.product-name");
	By topDealsLink = By.linkText("Top Deals");
	By plusButton =By.cssSelector(".increment");
	By addToCartButton =By.cssSelector(".product-action button");
	By cartIconButton= By.cssSelector(".cart-icon");
	By checkoutButton= By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	
	
	
	// actions methods
	public void searchItem(String name) {
		driver.findElement(searchBox).sendKeys(name);
		driver.findElement(searchBtn).click();
		
	}

	public String getProductName() {
		return driver.findElement(productName).getText().split("-")[0].trim();
	}
	
	public void switchToTopDealsPage() {
		driver.findElement(topDealsLink).click();
		
	}

	public void incrementProductCount() {
		driver.findElement(plusButton).click();
		
	}
	
	public void addToCart() {
		driver.findElement(addToCartButton).click();
		
	}
	
	
	public void cartIcon() {
		driver.findElement(cartIconButton).click();
		
	}
		
	public void proceedToCheckOut() {
		driver.findElement(checkoutButton).click();
		
	}
	


}
