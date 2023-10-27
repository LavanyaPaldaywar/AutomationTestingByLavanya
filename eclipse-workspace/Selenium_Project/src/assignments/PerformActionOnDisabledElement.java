
//Launch JSAM and perform action on disabled element
// org.openqa.selenium.ElementNotInteractableException

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformActionOnDisabledElement 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lavan/OneDrive/Desktop/learningHTML1%20(1).html");
		
		WebElement lname = driver.findElement(By.id("121"));
		boolean lname1 =lname.isEnabled();
		System.out.println("lastname field\t" +lname1);
		lname.sendKeys("lavanya");
		
	}

}
