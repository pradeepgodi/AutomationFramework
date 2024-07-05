package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CartPage;
import pageObjects.LandinPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;

public class CartPageStepDefinition {
	TestContextSetup testContextSetup;
	public String offerPageProductName;
	PageObjectManager pageObjectManager;
	CartPage cartPage;
	
	
	public CartPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@Then("Verifies that same product is listed in the checkout table")
	public void verifies_that_same_product_is_listed_in_the_table() throws InterruptedException {
		Thread.sleep(2000);
		cartPage= testContextSetup.pageObjectManager.checkOutPage();
		String cartPageProductName =cartPage.getProductName();
		System.out.println("Cart page Product Name ="+cartPageProductName);
		Assert.assertEquals(cartPageProductName,testContextSetup.productNameHomePage);
		
	}
	
	
	@Then("^enter the promocode (.+) and click on apply button$")
	public void enter_the_promocode_somecode_and_click_on_apply_button(String promoCode) {
	cartPage.promoCodeBox(promoCode);
	cartPage.applyButton();
	cartPage.placeOrder();
	}
	



}
