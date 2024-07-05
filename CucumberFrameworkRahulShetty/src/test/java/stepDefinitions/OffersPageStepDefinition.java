package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandinPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;

public class OffersPageStepDefinition {
	TestContextSetup testContextSetup;
	public String offerPageProductName;
	PageObjectManager pageObjectManager;
	
	public OffersPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		System.out.println("OffersPageStepDefinition Constructor Initializing");
	}
	
	
	
//	@Then("User searches for the same {string} shortname in offers page to check if product exists")
	@Then("^User searches for the same (.+) shortname in offers page to check if product exists$")
	public void user_searches_for_the_same_shortname_in_offers_page_to_check_if_product_exists(String shortNameOfferPage) throws InterruptedException {
		swithToOffersPage();
		
		
		OffersPage op = testContextSetup.pageObjectManager.offersPage();
		Thread.sleep(2000);
		op.searchItem(shortNameOfferPage);
		
//		testContextSetup.driver.findElement(By.cssSelector("#search-field")).sendKeys(shortNameOfferPage);
		
		offerPageProductName= op.getProductName(); //below code is implemented in the page factory
//		offerPageProductName=testContextSetup.driver.findElement(By.xpath("//tbody/tr/td[1]")).getText().trim();

		System.out.println("Offer Page producut = "+offerPageProductName);
			
	}

	public void swithToOffersPage() {
		System.out.println("User clicked on offers page.");
		
//		pageObjectManager=new PageObjectManager(testContextSetup.driver);
//		LandinPage lp=pageObjectManager.getLandingPage();
		LandinPage lp = testContextSetup.pageObjectManager.getLandingPage();
		
//		LandinPage lp = new LandinPage(testContextSetup.driver);
		lp.switchToTopDealsPage();
//		testContextSetup.driver.findElement(By.linkText("Top Deals")).click();
     
		testContextSetup.genericUtils.swithWindowToChild();
		
//		Set<String> windows = testContextSetup.driver.getWindowHandles();	
//		Iterator<String> itr= windows.iterator();
//		String parentWindow=itr.next();
//		String childWindow=itr.next();
//		testContextSetup.driver.switchTo().window(childWindow);
		
	}
	
	
	@Then("validate that the product name is same on both the pages")
	public void validate_that_the_product_name_is_same_on_both_the_pages() {
		System.out.println(testContextSetup.productNameHomePage +" : "+ offerPageProductName);
		Assert.assertEquals(offerPageProductName,testContextSetup.productNameHomePage);
	}
	

}
