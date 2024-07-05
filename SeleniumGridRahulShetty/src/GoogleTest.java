import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class GoogleTest {
	
	
	@Test
	public void HomePageCheck() throws MalformedURLException, URISyntaxException {
		
		DesiredCapabilities caps = new DesiredCapabilities();	
//		caps.setBrowserName("chrome");
//		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
				
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.2.75:4444").toURL(),caps);
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("google");
		System.out.println(driver.getTitle());
		
		driver.close();
	}
	

}
