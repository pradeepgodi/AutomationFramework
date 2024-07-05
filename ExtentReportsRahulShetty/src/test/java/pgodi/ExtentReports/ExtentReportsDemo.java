package pgodi.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemo {

	ExtentReports extent ;
	
	@BeforeTest
	public void config() {
		
		//ExtentReports , ExtentSparkReporter are 2 important classes to generate extent reports
		
		String path = System.getProperty("user.dir") + "\\reports\\index.html";	
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Automation Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "pgodi");
		
		
	}
	
	@Test
	public void initialDemo() {
		
		ExtentTest test= extent.createTest("Initial Demo");
	

		System.setProperty("webdriver.gecko.driver","E:\\selenium\\Installers\\drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		extent.flush();
		Assert.assertTrue(false);
		test.fail("Results do not match");
		driver.close();
		
	}
	
}
