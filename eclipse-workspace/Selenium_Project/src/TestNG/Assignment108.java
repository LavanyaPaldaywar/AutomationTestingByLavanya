
//How to do right click anywhere in the website?
//Use - contextClick ();  method

package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment108 
{
	@Test
	public void rightclick() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		//close popup
		driver.findElement(By.xpath("//span[.='✕']")).click();
		Thread.sleep(3000);
		
		WebElement grocery = driver.findElement(By.xpath("(//div[@class='YBLJE4'])[1]"));
		Actions a1 = new Actions(driver);
		Thread.sleep(3000);
		a1.contextClick(grocery).perform();
		
		Thread.sleep(3000);
	}
}
