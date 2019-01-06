package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		
		Thread.sleep(4000);
		
		String currentUrl = driver.getCurrentUrl();
		
		if (currentUrl.equals("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("Admin login is Successful: PASSED");
		} else {
			System.out.println("Admin login is UnSuccessful: Failed");
		}
		driver.close();
	}

}
