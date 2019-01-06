package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeriRedirect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.gcrit.com/build3/admin");
		driver.findElement(By.linkText("Online Catalog")).click();
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		
		if (url.equals("http://www.gcrit.com/build3")){
			System.out.println("It is redirecting to user interface from admin interface: PASSED");
		} else {
			System.out.println("It is not redirecting to user interface from admin interface: FAILED");
		}
		
		driver.close();
	}
}
