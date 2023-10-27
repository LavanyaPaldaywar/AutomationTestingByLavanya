


package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lavan/OneDrive/Desktop/learningHTML1%20(1).html");
		
		WebElement lname = driver.findElement(By.id("121"));
		boolean lname1 =lname.isDisplayed();
		System.out.println(lname1);
		if(lname1==true)
		{
			System.out.println("Element is displayed");
		}
		else
		{
			System.out.println("Element is not displayed");
		}
	}

}
