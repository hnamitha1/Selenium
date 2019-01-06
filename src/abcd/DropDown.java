package abcd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.gcrit.com/build3/create_account.php");
		
		boolean displayStatus = driver.findElement(By.name("country")).isDisplayed();
		System.out.println(displayStatus);
		
		boolean enableStatus = driver.findElement(By.name("country")).isEnabled();
		System.out.println(enableStatus);
		
		Select dropDown = new Select(driver.findElement(By.name("country")));
		dropDown.selectByVisibleText("India");
		dropDown.selectByIndex(6);
		
		List<WebElement> e = dropDown.getOptions();
		System.out.println(e.size());
		
		driver.close();
	}

}
