
//How to take screenshot by adding APACHE jars?

package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment99 
{
	@Test
	public void google() throws InterruptedException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		TakesScreenshot s1 = driver;
		File f1 = s1.getScreenshotAs(OutputType.FILE);//SOURCE
		File object = new File("C:\\Users\\lavan\\eclipse-workspace\\Selenium_Project\\Screenshot\\India.png");
		FileUtils.copyFile(f1, object);
		
		Thread.sleep(10000);
		driver.quit();
		
	}
}
