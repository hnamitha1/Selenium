package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BatchTesting {
	static WebDriver driver;
	static String ErrorMessage;
	
	public void launchApplication(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
	}
	
	public void closeApplication(){
		driver.close();
	}
	
	public void adminLogin(String Uname, String pwd){
		driver.findElement(By.name("username")).sendKeys(Uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.id("tdb1")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BatchTesting obj = new BatchTesting();
		
		obj.launchApplication();
		obj.adminLogin("admin", "admin@123");
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		
		if(url.contains("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Admin login is successful: PASSED");
		} else {
			System.out.println("Admin login is unsuccessful: FAILED");
		}
		obj.closeApplication();
		
		//Testcase2
		obj.launchApplication();
		obj.adminLogin("admin1", "admin@123");
		Thread.sleep(3000);
		url = driver.getCurrentUrl();
		
		if(! url.contains("http://www.gcrit.com/build3/admin/index.php")){
			ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
		} 
		if(ErrorMessage.contains("Error: Invalid administrator login attempt.")){
			System.out.println("Admin login is UnSuccessful but showing the correct error message: Passed");
		} else {
			System.out.println("Admin login is UnSuccessful and not showing the correct error message: Failed");
		}
		obj.closeApplication();
		
		//Test case3
		obj.launchApplication();
		obj.adminLogin("admin", "admin@123");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Online Catalog")).click();
		Thread.sleep(3000);
		
		url = driver.getCurrentUrl();
		
		if (url.equals("http://www.gcrit.com/build3/")){
			System.out.println("It is redirecting to user interface from admin interface: PASSED");
		} else {
			System.out.println("It is not redirecting to user interface from admin interface: FAILED");
		}
		
		//obj.closeApplication();
		
	}

}
