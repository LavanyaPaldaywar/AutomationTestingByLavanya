
//What will happen if you fetch the value from your excelsheet where value is a number?
//Ans- IllegalStateException will come

package datadriventesting;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Assignment106
{
	@Test
	public void ddtexception() throws EncryptedDocumentException, IOException
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\lavan\\eclipse-workspace\\Selenium_Project\\ExcelSheet\\LavanyaExcel.xlsx");
		Workbook w =WorkbookFactory.create(fs);
		
		String username = w.getSheet("login").getRow(1).getCell(2).getStringCellValue();
		System.out.println(username);
		
	}
}
