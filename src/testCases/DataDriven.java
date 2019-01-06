package testCases;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws InterruptedException, IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileReader file = new FileReader("C:/Users/girish/Desktop/selenium1/input.txt");
		BufferedReader br = new BufferedReader(file);
		
		int count = 0;
		int iteration = 0;
		String line;
		
		while((line=br.readLine()) != null){
			count = count + 1;
			iteration = iteration + 1;
			
			if (count >= 1){
				String [] inputData = line.split(", ", 2);
				System.out.println(inputData[0] + " " + inputData[1]);
				driver.get("http://www.gcrit.com/build3/admin/login.php");
				driver.findElement(By.name("username")).sendKeys(inputData[0]);
				driver.findElement(By.name("password")).sendKeys(inputData[1]);
				driver.findElement(By.id("tdb1")).click();
				Thread.sleep(3000);
				String url = driver.getCurrentUrl();
				
				if( url.contains("http://www.gcrit.com/build3/admin/index.php")){
					System.out.println("Iteration " + iteration + " Admin login is successful: PASSED");
				} else {
					System.out.println("Iteration " + iteration + " Admin login is not successful: FAILED");
				}
			}
		}
		driver.close();
		file.close();
		br.close();
	}

}
