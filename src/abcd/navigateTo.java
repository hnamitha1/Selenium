package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateTo {

	public static void main(String[] args) {
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
		driver.close();

	}

}
