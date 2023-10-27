
//Launch Flipkart from guest mode and enter mobile number ,
//click request OTP and close login popup using relative xpath

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment77 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		//enter mobile number
		driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("9999999999");
		Thread.sleep(3000);
		
		//request otp button
		driver.findElement(By.xpath("//button[.='Request OTP']")).click();
		Thread.sleep(3000);
		
		//close popup
		driver.findElement(By.xpath("//span[.='✕']")).click();
		Thread.sleep(3000);
	}

}
