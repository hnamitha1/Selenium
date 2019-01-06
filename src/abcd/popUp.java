package abcd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys("Shiva");
        driver.findElement(By.name("proceed")).click();
        
        Alert popUp = driver.switchTo().alert();
        
        String errorMessage = popUp.getText();
        System.out.println(errorMessage);
        Thread.sleep(3000);
        popUp.accept();
        
        driver.close();
	}

}
