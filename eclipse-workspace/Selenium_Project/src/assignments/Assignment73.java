
//Open any browser, then navigate to Google.com .Click on Gmail tab by using Linktext and Signin link using partial linktext locator.

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment73 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Sign")).click();
	}

}
