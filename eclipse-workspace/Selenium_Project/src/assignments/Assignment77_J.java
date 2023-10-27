
//Launch flipkart.com and close the flipkart popup(otp with mobile) and then locate mobiles using text message xpath formula

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment77_J 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		//closing the popup using text message xpath formula
		driver.findElement(By.xpath("//span[.='✕']")).click();
		Thread.sleep(3000);
		
		//clicking on mobiles link using text message xpath formula
		driver.findElement(By.xpath("(//span[.='Mobiles'])[2]")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
