
//Program for using Robot Class and Virtual keys functions
package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment109 
{
	@Test
	public void righclickandchooseoption() throws InterruptedException, AWTException
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
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
	}
}
