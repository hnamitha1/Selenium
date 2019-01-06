package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateForward {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk/");
		String currentUrl = driver.getTitle();
		System.out.println(currentUrl);
		
		driver.navigate().to("https://www.yahoo.com");
		String currentUrl1 = driver.getTitle();
		System.out.println(currentUrl1);
		
		Thread.sleep(6000);
		driver.navigate().back();
		String currentUrl2 = driver.getTitle();
		System.out.println(currentUrl2);
		Thread.sleep(6000);
		
		driver.navigate().forward();
		String currentUrl3 = driver.getTitle();
		System.out.println(currentUrl3);
		Thread.sleep(2000);
		driver.close();
	}

}
