package testng_facebook_ddt;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC1 extends LaunchAndQuit 
{
	TestData td = new TestData();
	@Test
	public void scenario1() throws EncryptedDocumentException, IOException
	{
		
		fetching();
		WebElement uname = driver.findElement(By.id("email"));
		uname.sendKeys(username); //id locator
		WebElement pword = driver.findElement(By.id("pass"));
		pword.sendKeys(password); //id locator
		driver.findElement(By.name("login")).click(); // name locator;
	}
}
