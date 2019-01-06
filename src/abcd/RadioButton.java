package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.gcrit.com/build3/create_account.php");
		
		boolean displayStatus = driver.findElement(By.xpath("//input[@value='m']")).isDisplayed();
		System.out.println(displayStatus);
		
		boolean enableStatus = driver.findElement(By.xpath("//input[@value='m']")).isEnabled();
		System.out.println(enableStatus);
		
		String elementType = driver.findElement(By.xpath("//input[@value='m']")).getAttribute("value");
		System.out.println(elementType);
		
		boolean isSelected = driver.findElement(By.xpath("//input[@value='m']")).isSelected();
		System.out.println(isSelected);
		
		driver.findElement(By.xpath("//input[@value='m']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='m']")).isSelected());
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.close();
	}

}
