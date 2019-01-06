package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerInExLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.findElement(By.linkText("Create account")).click();
		String url1 = driver.getCurrentUrl();
		//System.out.println(url1);
		if (url1.contains("wikipedia.org")){
			System.out.println("First Verification: It is an internal Link : Passed");
		} else {
			System.out.println("It is not an internal link: Failed");
		}
		driver.navigate().back();
		driver.findElement(By.linkText("www.seleniumhq.org")).click();
		String url2 = driver.getCurrentUrl();
		//System.out.println(url2);
		if (url2.contains("https://www.seleniumhq.org/")){
			System.out.println("Second Verification: It is an external Link : Passed");
		} else {
			System.out.println("Second Verification: It is an internal link: Failed");
		}
		driver.close();
	}

}
