package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import pageObjects.LandinPage;
import pageObjects.PageObjectManager;

public class GenericUtils {
	WebDriver driver;
	
	
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void swithWindowToChild() {  
		Set<String> windows = driver.getWindowHandles();	
		Iterator<String> itr= windows.iterator();
		String parentWindow=itr.next();
		String childWindow=itr.next();
		driver.switchTo().window(childWindow);
		
	}

}
