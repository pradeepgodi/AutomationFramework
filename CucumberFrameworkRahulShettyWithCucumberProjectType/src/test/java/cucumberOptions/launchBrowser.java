package cucumberOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchBrowser {
	
	WebDriver driver;
	
	@Test
	public void launch() {

		System.setProperty("webdriver.gecko.driver",
				"E:\\selenium\\Installers\\drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");	
		driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.close();
	}

}
