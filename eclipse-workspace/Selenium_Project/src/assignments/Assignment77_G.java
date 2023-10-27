
//Login to facebook using relative xpath formula

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment77_G 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Email or phone number
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lavanya");
		
		//Password
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("lavanya");
		
		//login button
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.tagName("button")).click();
	}

}
