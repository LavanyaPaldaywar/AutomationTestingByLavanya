
//Program- What will happen if we fetch the value of that cell which does not have the value?
//Ans-NullPointerException will come

package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Assignment105 
{
	@Test
	public void ddtexception() throws EncryptedDocumentException, IOException
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\lavan\\eclipse-workspace\\Selenium_Project\\ExcelSheet\\LavanyaExcel.xlsx");
		Workbook w =WorkbookFactory.create(fs);
		
		String username = w.getSheet("login").getRow(10).getCell(1).getStringCellValue();
		System.out.println(username);
		
	}
}
