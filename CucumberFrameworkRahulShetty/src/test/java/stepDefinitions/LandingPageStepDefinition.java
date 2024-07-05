package stepDefinitions;

import java.io.IOException;
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

public class LandingPageStepDefinition {
	public WebDriver driver;
//	public String productNameHomePage;
	TestContextSetup testContextSetup; // This instantiation helps in creating dependency injection passing the driver, variables btwn multiple step dependencies
	
public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		System.out.println("LandingPageStepDefinitionn Constructor Initializing");
	}
	
	
	@Given("User is on the Greenkart landing page")
	public void user_is_on_the_greenkart_landing_page() throws IOException {
//		System.setProperty("webdriver.gecko.driver","E:\\selenium\\Installers\\drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");	
//		testContextSetup.driver = new FirefoxDriver();
//		testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		System.out.println("Launched the Browser.");
//		String title = testContextSetup.testBase.driver.getTitle();
		String title =testContextSetup.testBase.WebDriverManager().getTitle();
		System.out.println("Title of the Page = "+title);
		Assert.assertTrue(title.contains("GreenKart"), "Faied to land to GreenKart page");
	}
	
	
	
//	@When("User searches for a product using the shortname {string} and views the actual name of the product") // when only one variable is passed
	@When("^User searches for a product using the shortname (.+) and views the actual name of the product$") // using regular expression
	public void user_searches_for_a_product_using_the_shortname_and_views_the_actual_name_of_the_product(String shortName) throws InterruptedException {
		
//		LandinPage lp = new LandinPage(testContextSetup.driver);
		LandinPage lp = testContextSetup.pageObjectManager.getLandingPage();
		lp.searchItem(shortName);
		
//		testContextSetup.driver.findElement(By.cssSelector(".search-keyword")).sendKeys(shortName);
//		testContextSetup.driver.findElement(By.cssSelector(".search-button")).click();
		Thread.sleep(1000);
		
		testContextSetup.productNameHomePage = lp.getProductName();
//		testContextSetup.productNameHomePage= testContextSetup.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		System.out.println("Landing Page product name = "+testContextSetup.productNameHomePage);

	}
	
	
//	@Then("Increment the product count by {int} times and add to the cart and Navigates to the checkout paget")
	@Then("Increment the product count by {int} times and add to the cart and Navigates to the checkout page")
	public void increment_the_product_count_by_times_and_add_to_the_cart(Integer incrementCount) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		LandinPage lp =testContextSetup.pageObjectManager.getLandingPage();
		for (int i=0;i<incrementCount-1;i++) {
			lp.incrementProductCount();
		}
		Thread.sleep(2000);
		lp.addToCart();
		lp.cartIcon();
		lp.proceedToCheckOut();
		
	}
	
	
	
	
	
	

}
