
//Google Launch Program with @Test annotation

package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment94 
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Launch Browser");
	}
	@Test
	public void testcase1() throws InterruptedException 
	{
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		System.out.println("Search");
		Thread.sleep(5000);
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
		System.out.println("Quit");
	}
}
