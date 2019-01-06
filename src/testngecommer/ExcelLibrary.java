package testngecommer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {
	String retVal=null;
	public String getExcelData(String sheetname,int rowNum, int cellNum) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:/Users/girish/Desktop/selenium1/input.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet("Sheet1");
			Row r = s.getRow(rowNum);
			Cell c = r.getCell(cellNum);
			retVal = c.getStringCellValue();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retVal;
	}
	public int getRowNum(String sheetname) {
		int rowCnt=0;
		try {
			FileInputStream fis=new FileInputStream("C:/Users/girish/Desktop/selenium1/input.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetname);
			rowCnt=s.getLastRowNum();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rowCnt;
	}

}
