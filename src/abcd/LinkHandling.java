package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk/");
		
		boolean displayStatus = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(displayStatus);
		
		boolean enableStatus = driver.findElement(By.linkText("Gmail")).isEnabled();
		System.out.println(enableStatus);
		
		driver.findElement(By.linkText("Gmail")).click();
		driver.close();
	}

}
