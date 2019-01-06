package testngecommer;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataDriven {
	private static WebDriver driver;
	@Test(dataProvider= "testdata")
	public void adminLogin(String Uname, String Pwd) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys(Uname);
		driver.findElement(By.name("password")).sendKeys(Pwd);
		driver.findElement(By.id("tdb1")).click();
		Thread.sleep(4000);
		Assert.assertEquals(driver.getCurrentUrl(), "http://www.gcrit.com/build3/admin/index.php");
	}
	@AfterMethod
	public void closeApp(){
		driver.close();
	}
	@DataProvider(name="testdata")
	public Object [] [] readExcel(){
	//public static void main(String [] args){
		int rowCnt = 0;
		File file = new File("C:/Users/girish/Desktop/selenium1/input.xlsx");
		String inputData[] [] = null;
		try {
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("Sheet1");
			rowCnt = sh.getLastRowNum();
			int noOfColumns = sh.getRow(0).getLastCellNum();
			System.out.println(rowCnt + " " + noOfColumns);
			
			inputData = new String[rowCnt + 1] [noOfColumns];
			
			for (int i = 0; i <= rowCnt ; i++){
				//System.out.println("hghh" + i);
				for (int j = 0; j < noOfColumns; j++){
					System.out.println(i + " " + j);
					Row r = sh.getRow(i);
					Cell c = r.getCell(j);
					inputData[i][j] = c.getStringCellValue();
					System.out.println(inputData[i][j]);
				}
			}
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(inputData);
		return inputData;
		
	}
}
