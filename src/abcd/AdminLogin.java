package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Instantiate the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		Thread.sleep(4000);
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Admin login is successful- Passed");
		} else {
			System.out.println("Admin login is unsuccessful- Failed");
		}
		
		driver.close();
	}

}
