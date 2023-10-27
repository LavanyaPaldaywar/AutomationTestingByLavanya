
//Launch JSAM and check whether field lastname is enabled or not

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_1 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lavan/OneDrive/Desktop/learningHTML1%20(1).html");
		
		WebElement lname = driver.findElement(By.id("121"));
		boolean lname1 =lname.isEnabled();
		System.out.println("lastname field\t" +lname1);
		if(lname1==true)
		{
			driver.findElement(By.id("121")).sendKeys("lavanya");
		}
		else
		{
			System.out.println("Element is not enabled");
		}
		
		WebElement fname = driver.findElement(By.name("fname"));
		boolean fname1 =fname.isEnabled();
		System.out.println("firstname field\t" +fname1);
		
		driver.quit();
		
	}

}
