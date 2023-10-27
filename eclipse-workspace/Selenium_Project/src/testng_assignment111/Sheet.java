package testng_assignment111;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sheet 
{
	ChromeDriver driver;
	String username;
	String password;
	public void sheet() throws EncryptedDocumentException, IOException, InterruptedException
	{
	FileInputStream fs = new FileInputStream("C:\\Users\\lavan\\eclipse-workspace\\Selenium_Project\\ExcelSheet\\LavanyaExcel.xlsx");
	Workbook w =WorkbookFactory.create(fs);
	
	String username1 =NumberToTextConverter.toText(w.getSheet("login").getRow(4).getCell(0).getNumericCellValue());
	System.out.println(username1);
	this.username=username1;
	System.out.println(username);
	
	
	String password1 =w.getSheet("login").getRow(4).getCell(1).getStringCellValue();
	System.out.println(password1);
	this.password = password1;
	System.out.println(password);
	
}
}
