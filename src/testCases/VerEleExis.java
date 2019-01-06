package testCases;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerEleExis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.uk");
		/*//Without Exception handling
		 * boolean linkExistence = driver.findElement(By.linkText("Yahoo")).isDisplayed();
		
		if (linkExistence == true ) {
			System.out.println("Gmail link Exists : Passed");
		} else {
			System.out.println("Gmail link not Exists : Failed");
		}
		driver.close();
		*/
		//With exception handling
		
		try { 
			boolean linkExistence = driver.findElement(By.linkText("Yahoo")).isDisplayed();
			if (linkExistence == true ) {
				System.out.println("Gmail link Exists : Passed");
			}
		} catch(NoSuchElementException e ) {
			System.out.println("Gmail link not Exists : Failed");
		}
		driver.close();
	}

}
