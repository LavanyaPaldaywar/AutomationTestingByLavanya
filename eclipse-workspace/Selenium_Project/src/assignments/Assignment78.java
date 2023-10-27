
//Launch flipkart.com , hoverover on fashion and click on men's casual shirt

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment78 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		//close popup
		driver.findElement(By.xpath("//span[.='✕']")).click();
		
		Thread.sleep(3000);
		
		WebElement Fashion = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(Fashion).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Men's Casual Shirts")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
