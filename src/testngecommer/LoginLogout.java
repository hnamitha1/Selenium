package testngecommer;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ExcelLibrary xlib=new ExcelLibrary();
		driver.get("http://demo.actitime.com");
		int rowNum=xlib.getRowNum("Sheet1");
		System.out.println(rowNum);
		/*for (int i = 1; i <=rowNum; i++) {
			String un=xlib.getExcelData("Sheet1",i, 0);
			String pw=xlib.getExcelData("Sheet1",i, 1);
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.linkText("Login")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
		}*/
		driver.close();
	}

}


