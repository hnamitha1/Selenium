package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("SIGN IN")).click();
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.navigate().to("http://www.gcrit.com/build3/create_account.php");
		driver.findElement(By.xpath("//input[@value='m']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("newsletter")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("newsletter")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
