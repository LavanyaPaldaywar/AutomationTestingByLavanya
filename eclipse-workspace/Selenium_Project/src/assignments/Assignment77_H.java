
//Launch grotechminds registration page and locate each and every component using relative xpath formula

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment77_H 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		//User Name
		driver.findElement(By.xpath("//input[@id='1']")).sendKeys("lavanya");
		
		//Password
		driver.findElement(By.xpath("//input[@id='3']")).sendKeys("lavanya");
		
		//Your First name
		driver.findElement(By.xpath("//input[@id='4']")).sendKeys("Lavanya");
		
		//Your Last name
		driver.findElement(By.xpath("//input[@id='5']")).sendKeys("Lavanya");
		
		//Who Are You // Male or Female
		driver.findElement(By.xpath("(//input[@name='radio-45'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='radio-45'])[2]")).click();

		//Pincode
		driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys("500041");
		
		//Are you ready to relocate to bangalore?
		driver.findElement(By.xpath("//input[@name='checkbox-833[]']")).click();
		Thread.sleep(2000);
		
		//submit
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Thread.sleep(3000);
		//this should be handled with xpath as none of the locators are unique.
		
		//close the browser
		driver.quit();
	}

}
