package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/admin");
		WebElement editBox = driver.findElement(By.name("username"));
		editBox.sendKeys("india123");
		Thread.sleep(2000);
		editBox.clear();
		Thread.sleep(2000);
		editBox.sendKeys("admin");
		
		driver.close();
	}

}
