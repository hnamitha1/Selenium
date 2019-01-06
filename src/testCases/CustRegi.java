package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustRegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Baby");
		driver.findElement(By.name("lastname")).sendKeys("Jack");
		driver.findElement(By.id("dob")).sendKeys("10/10/2016");
		driver.findElement(By.name("email_address")).sendKeys("babyjack@gmail.com");
		
		driver.findElement(By.name("street_address")).sendKeys("cbebbies");
		driver.findElement(By.name("postcode")).sendKeys("EL26 4RJ");
		driver.findElement(By.name("city")).sendKeys("London");
		driver.findElement(By.name("state")).sendKeys("England");
		Select dropDown = new Select(driver.findElement(By.name("country")));
		dropDown.selectByVisibleText("United Kingdom");
		
		driver.findElement(By.name("telephone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmation")).sendKeys("abc123");
		
		driver.findElement(By.id("tdb4")).click();
		
		String confirmationMessage = "Your Account Has Been Created!";
		
		if (confirmationMessage.equals("Your Account Has Been Created!")){
			System.out.println("Customer Registration is Successful: PASSED");
		} else {
			System.out.println("Customer Registration is UnSuccessful: FAILED");
		}
		driver.close();
	}

}
