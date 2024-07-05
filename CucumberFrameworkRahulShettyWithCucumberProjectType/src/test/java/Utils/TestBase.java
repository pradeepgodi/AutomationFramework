package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {

//		String fisPath = "C:\\Users\\user\\eclipse-workspace\\CucumberRahulShetty\\src\\test\\resources\\global.properties";
		String fisPath = System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties";
		FileInputStream fis = new FileInputStream(fisPath);
		Properties prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browserName");
		String url = prop.getProperty("QAURL");

		if (driver == null) {
			System.out.println("Initializing driver for = "+browser);
			

			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"E:\\selenium\\Installers\\drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"E:\\selenium\\Installers\\drivers\\chromedriver-win64\\chromedriver.exe");
				driver = new ChromeDriver();

			} else {
				System.out.println("Browser not defined");
			}
			driver.get(url);
		}
		return driver;

	}

}
