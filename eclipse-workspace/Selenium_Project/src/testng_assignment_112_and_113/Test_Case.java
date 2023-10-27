package testng_assignment_112_and_113;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners_Class.class)
public class Test_Case 
{
	ChromeDriver driver;
	@Test
	public void scenario1() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Launch Browser");
		
		WebElement search =driver.findElement(By.name("fdgg"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		System.out.println("testcase1 - Search India");
		
		Thread.sleep(3000);
		
		driver.quit();
    }
	@Test
	public void scenario2() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Launch Browser");
		
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("France");
		search.sendKeys(Keys.ENTER);
		System.out.println("testcase1 - Search France");
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
