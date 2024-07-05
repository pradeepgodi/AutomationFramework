package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



/*
1) Rereun the failed test cases by adding the plugin in the testNGRunner
	plugin=	"rerun:target/failed_scenarios.txt" --> here the failed line of the cde will be stored
	e.g : file:src/test/java/features/searchProduct.feature:20
2) To add Extent report in cucumber framework	
		plugin=	 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
3) To run tests in parallel
			@Override
			@DataProvider(parallel=true)
				public Object[][] scenarios(){
					return super.scenarios();
			}
4) Generating the html test report in cucumber using the plugin attribute   
				a) html report plugin = {"pretty","html:target/reportCucumber.html"}		
				b) json report plugin = {"pretty","json:target/reportCucumber.json"}	
*/

@CucumberOptions(features = "src/test/java/features",glue = "stepDefinitions",monochrome = true,
				plugin={"pretty","html:target/reportCucumber.html","json:target/reportCucumber.json",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"rerun:target/failed_scenarios.txt"},
				tags = "@PlaceOrder or @Landing")


public class TestNGRunner extends AbstractTestNGCucumberTests{
	
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		System.out.println("Starting TestNG Runner");
		return super.scenarios();
		
	}
	
}
