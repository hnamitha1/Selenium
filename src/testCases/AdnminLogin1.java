package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdnminLogin1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String ErrorMessage = null;
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
				
		if (!url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
		} 
		
		if (url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("Admin login is Successful: PASSED");
		} else if(ErrorMessage.contains("Error: Invalid administrator login attempt.")){
			System.out.println("Admin login is UnSuccessful but showing the correct error message: Passed");
		} else {
			System.out.println("Admin login is UnSuccessful and not showing the correct error message: Failed");
		}
		driver.close();
	}

}
