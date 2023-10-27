package testng_facebook_ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestData 
{
	String username;
	String password;
	public void fetching() throws IOException, EncryptedDocumentException
	{
		
		FileInputStream fs = new FileInputStream("C:\\Users\\lavan\\eclipse-workspace\\Selenium_Project\\ExcelSheet\\LavanyaExcel.xlsx");
		Workbook w =WorkbookFactory.create(fs);
		Sheet s = w.getSheet("login");
		
		username = s.getRow(1).getCell(0).getStringCellValue();

		password = s.getRow(1).getCell(1).getStringCellValue();
		
	}
}
