package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium.condition")).click();
		driver.close();
		

	}

}
