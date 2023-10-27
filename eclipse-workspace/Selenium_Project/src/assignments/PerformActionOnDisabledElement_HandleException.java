package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformActionOnDisabledElement_HandleException 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lavan/OneDrive/Desktop/learningHTML1%20(1).html");
		
		WebElement lname = driver.findElement(By.id("121"));
		boolean lname1 =lname.isEnabled();
		System.out.println("lastname field\t" +lname1);
		
		try
		{
			lname.sendKeys("lavanya");
			System.out.println("Element is disabled");
		}
		catch(ElementNotInteractableException e1)
		{
			System.out.println("Exception Handled");
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
