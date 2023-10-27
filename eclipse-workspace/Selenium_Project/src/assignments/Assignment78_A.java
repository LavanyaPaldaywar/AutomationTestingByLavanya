
//Launch amazon.in , hoverover on account and lists and click on signin button

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment78_A 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		WebElement accountsandlist = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountsandlist).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign in")).click();
		
	}

}
