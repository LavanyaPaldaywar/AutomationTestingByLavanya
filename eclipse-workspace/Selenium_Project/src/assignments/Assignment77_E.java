
//Login to facebook using relative xpath

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment77_E 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Email address or phone number
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("lavanya@gmail.com");
		
		//Password
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("lavanya");
		
		//Login button
		driver.findElement(By.xpath("//button")).click();
		
		Thread.sleep(8000);
		
		//driver.quit();
	}

}
