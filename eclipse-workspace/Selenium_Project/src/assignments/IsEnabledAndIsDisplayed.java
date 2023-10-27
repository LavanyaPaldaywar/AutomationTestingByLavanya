
//In c1 check whether element is enabled or not 
//In c2 check whether element is displayed or not
//Based on that perform action if (c1&&c2)

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledAndIsDisplayed 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lavan/OneDrive/Desktop/learningHTML1%20(1).html");
		
		WebElement lname = driver.findElement(By.id("121"));
		boolean c1 =lname.isEnabled();
		System.out.println(c1);
		
		WebElement lname1 = driver.findElement(By.id("121"));
		boolean c2 =lname.isDisplayed();
		System.out.println(c2);
		
		if (c1 && c2)
		{
			System.out.println("Action can not be performed");
		}
		else
		{
			try
			{
			lname.sendKeys("lavanya");	
			System.out.println("Action performed");
			}
			catch(ElementNotInteractableException e1)
			{
				System.out.println("Exception Handled");
			}
		}
	}

}
