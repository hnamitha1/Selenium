package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.uk/");
		//driver.findElement(By.id("hplogo")).click();
		//driver.findElement(By.xpath("*[@id='hplogo']/a/img")).click();
		String imageTitle = driver.findElement(By.xpath("//div[@id='hplogo']/a/img")).getAttribute("title");
		System.out.println(imageTitle);
	}

}
