package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiTestCasesPriority {
	static WebDriver driver;
	@Test (priority=1)
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test (priority=2)
	public void verifyTitle(){
		driver.get("https://www.google.co.in/");
		String pageTitle=driver.getTitle();
		Assert.assertEquals(pageTitle, "Google");
	}
	@Test(priority=3)
		public void closeBrowser(){
		driver.close(); 
	}
}
