package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.name("email_address")).sendKeys("babyjack@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc7y123");
		driver.findElement(By.id("tdb5")).click();
		
		try {
			if(driver.findElement(By.linkText("Log Off")).isDisplayed()){
				System.out.println("Customer login is Sussceful: PASSED");
			}
		}catch(NoSuchElementException e) {
			System.out.println("Customer login is UnSussceful: FAILED");
		}
		driver.close();
		
	}

}
