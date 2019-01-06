package testCases;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeriLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.id("usernameId")).sendKeys("gcreddy7");
		driver.findElement(By.name("j_password")).sendKeys("gld938");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Captcha");
		String captcha = scan.nextLine();
		
		driver.findElement(By.id("nlpAnswer")).sendKeys(captcha);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(4000);
		scan.close();
		
		/*if(driver.findElement(By.linkText("Sign Out")).isDisplayed()){
			System.out.println("Login Successful: PASSED");
		} else {
			System.out.println("Login not successful: FAILED");
		}*/
		try{
			if (driver.findElement(By.linkText("Sign Out")).isDisplayed()){
			   System.out.println("Login is Successful -Passed");
		    }
		} catch (NoSuchElementException e) {
			System.out.println("Login is Unsuccessful -Failed");
		}
		driver.close();
	}

}
