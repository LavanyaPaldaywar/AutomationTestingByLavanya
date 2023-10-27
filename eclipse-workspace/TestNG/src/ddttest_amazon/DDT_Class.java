package ddttest_amazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DDT_Class 
{
	ChromeDriver driver;
	String username;
	String password;
	@Test
	public void code() throws EncryptedDocumentException, IOException
	{
	FileInputStream fs = new FileInputStream("C:\\Users\\lavan\\eclipse-workspace\\TestNG\\ExcelSheet\\AmazonExcel.xlsx");
	Workbook wb = WorkbookFactory.create(fs);
	
	username = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
	System.out.println(username);
	
	password = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	System.out.println(password);
	}
	
}
