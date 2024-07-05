package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@NetBanking")
	public void netbankingSetup() {
		System.out.println("\n***** Hooks: setting netbanking database*****");
		
	}
	
	@After("@NetBanking")
	public void tearDownNetbaking() {
		System.out.println("teardown netbanking database");

	}

	@Before("@Mortgage")
	public void mortgagegSetup() {
		System.out.println("\n***** Hooks:setting mortgage database");
	
	}
	@After("@Mortgage")
	public void tearDownMortgage() {
		System.out.println("teardown Mortgage database");

	}

	@After
	public void tearDown() {
		System.out.println("teardown final database ****");

	}

}
