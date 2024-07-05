package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	WebDriver driver;
	
	By promoCodeBox =By.cssSelector(".promoCode");
	By promoButton =By.cssSelector(".promoBtn");
	By placeOrderButton= By.xpath("//button[contains(text(),'Place Order')]");
	By cartPageProductName = By.xpath("(//tr/td[2])[2]/p");

	public CartPage(WebDriver driver) {
		this.driver=driver;
		System.out.println("CartPage Constructor Initializing");
		
	}


	public void promoCodeBox(String promoCode) {
		driver.findElement(promoCodeBox).sendKeys(promoCode);

	}


	public void applyButton() {
		driver.findElement(promoButton).click();
			
	}

	
	public String getProductName() {
		return driver.findElement(cartPageProductName).getText().split("-")[0].trim(); 
			
	}

	public void placeOrder() {
		driver.findElement(placeOrderButton).click();
			
	}

}
