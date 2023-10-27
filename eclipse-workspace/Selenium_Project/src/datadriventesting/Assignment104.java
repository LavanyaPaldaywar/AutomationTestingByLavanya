
//Program to fetch the value in Excelsheet(DDT)
package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Assignment104 
{
	@Test
	public void ddt() throws EncryptedDocumentException, IOException
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\lavan\\eclipse-workspace\\Selenium_Project\\ExcelSheet\\LavanyaExcel.xlsx");
		Workbook w =WorkbookFactory.create(fs);
		
		/*Way 1
		Sheet s1= w.getSheet("login");
		
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String username =c1.getStringCellValue();
		System.out.println(username);
		
		Row r2 = s1.getRow(1);
		Cell c2 = r2.getCell(1);
		String password =c2.getStringCellValue();
		System.out.println(password);
		*/
		
		//Way 2
		
		String username = w.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(username);
		
		String password = w.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(password);
		
		}
}
