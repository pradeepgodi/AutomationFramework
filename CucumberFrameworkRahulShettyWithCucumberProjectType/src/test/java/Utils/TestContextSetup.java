package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String productNameHomePage;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	
	public TestContextSetup() throws IOException {
		try {
		testBase= new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
	}
	 catch (Exception e) {
		 System.out.println(e);
	 }
	
	}}

