package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleLaunch {
	@Test 
	public void verifyTitle(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String pageTitle=driver.getTitle();

		Assert.assertEquals(pageTitle, "Google");
		driver.close();	
	}	
}
