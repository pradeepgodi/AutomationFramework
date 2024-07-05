package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	
	@Given("User is on landing page")
	public void user_is_on_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
System.out.println("User is in landing page");	
}
//	@When("User login into application")
//	public void user_login_into_application() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("User login into application");	
//	}
	
	// login step using String arguments
//	@When("User login into application with {string} and password {string}")
//	public void user_login_into_application_with_and_password(String username, String password) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("User = " +username + " and password = "+password+" login into application");	;
//	}

	// login step using RegEX (.+) -> any data type is accepted
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password_provided(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User = " +username + " and password = "+password+" login into application");
	}
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is displayed");	
	}
	@Then("cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("cards are displayed");	
	}
	
	
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on Practice landing page");
//	    Assert.assertTrue(false);
	}

	@When("User signup in the application")
	public void user_signup_in_the_application(List<String> data) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    System.out.println(data.get(3));
	}
	
	
	@Given("setup the entry in DB")
	public void setup_the_entry_in_db() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Background : setup the entry in DB");
	}
	@When("launch the browser in config")
	public void launch_the_browser_in_config() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Background : launch the browser in config");
	}
	@Then("hit the home page url")
	public void hit_the_home_page_url() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Background : hit the home page url");
	}
	
}
