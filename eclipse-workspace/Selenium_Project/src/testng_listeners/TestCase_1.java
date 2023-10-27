package testng_listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners_Class_1.class)
public class TestCase_1 
{
	
	ChromeDriver driver;
	@Test
	public void scenario1()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Launch Browser");
		
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		System.out.println("testcase1 - Search India");
	}
}
