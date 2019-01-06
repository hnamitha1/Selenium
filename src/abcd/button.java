package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("SIGN IN")).click();
		WebElement nextButton = driver.findElement(By.id("identifierNext"));
		
		System.out.println(nextButton.isDisplayed());
		System.out.println(nextButton.isEnabled());
		
		nextButton.click();
		Thread.sleep(5000);
		System.out.println(nextButton.getAttribute("class"));
		
	}

}
