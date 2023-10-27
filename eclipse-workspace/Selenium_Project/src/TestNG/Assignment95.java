//For 5 countries use @Test annotation
package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment95 
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
		System.out.println("testcase1 - Search India");
		Thread.sleep(5000);
	}
	@Test
	public void testcase2() throws InterruptedException 
	{
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("America");
		search.sendKeys(Keys.ENTER);
		System.out.println("testcase2 - Search America");
		Thread.sleep(5000);
	}
	@Test
	public void testcase3() throws InterruptedException 
	{
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("Australia");
		search.sendKeys(Keys.ENTER);
		System.out.println("testcase3 - Search Australia");
		Thread.sleep(5000);
	}
	@Test
	public void testcase4() throws InterruptedException 
	{
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("Canada");
		search.sendKeys(Keys.ENTER);
		System.out.println("testcase4 - Search Canada");
		Thread.sleep(5000);
	}
	@Test
	public void testcase5() throws InterruptedException 
	{
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("Ireland");
		search.sendKeys(Keys.ENTER);
		System.out.println("testcase5 - Search Ireland");
		Thread.sleep(5000);
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
		System.out.println("Quit");
	}
}
