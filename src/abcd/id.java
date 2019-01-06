package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		//driver.findElement(By.id("identifierId")).sendKeys("namitha.h@gmail.com");
		WebElement editBox = driver.findElement(By.id("identifierId"));
		editBox.sendKeys("namitha.h@gmail.com");
		Thread.sleep(4000);
		editBox.clear();
		Thread.sleep(4000);
		editBox.sendKeys("namitha23.h@gmail.com");
		Thread.sleep(2000);
		driver.close();
		
	}

}
