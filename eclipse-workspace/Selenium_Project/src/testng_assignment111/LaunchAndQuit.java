package testng_assignment111;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchAndQuit extends Sheet
{
	@BeforeMethod
	public void launch() throws InterruptedException, EncryptedDocumentException, IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		WebElement signin = driver.findElement(By.linkText("Sign in"));
		signin.click();
		
		Thread.sleep(2000);
		
		WebElement phonenumber = driver.findElement(By.id("ap_email"));
		//Sheet s1  = new Sheet(); //
		sheet();
		phonenumber.sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		
		WebElement passwordfield = driver.findElement(By.id("ap_password"));
		passwordfield.sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.id("signInSubmit")).click();
		
	}
	@AfterMethod
	public void screenshotandquit() throws IOException, InterruptedException
	{
		TakesScreenshot s1 = driver;
		File f1 = s1.getScreenshotAs(OutputType.FILE);//SOURCE
		File object = new File("C:\\Users\\lavan\\eclipse-workspace\\Selenium_Project\\Screenshot\\Assignment111_Payment" + Math.random() + ".png");
		FileUtils.copyFile(f1, object);
		
		Thread.sleep(10000);
		driver.quit();
	}
}

