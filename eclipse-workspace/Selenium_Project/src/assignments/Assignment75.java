
//Try to locate each and every component of Grotechminds registration page except Religion and resume field.

//For reference the link is:"https://grotechminds.com/registration/"


package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment75 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		//User Name
		driver.findElement(By.id("1")).sendKeys("Lavanya");
		
		//Password
		driver.findElement(By.id("3")).sendKeys("Lavanya");
		
		//Your First name
		driver.findElement(By.name("text-397")).sendKeys("Lavanya");
		
		//Your Last name
		driver.findElement(By.name("text-398")).sendKeys("Lavanya");
		
		//Who Are You // Male or Female
		driver.findElement(By.name("radio-45")).click();
		Thread.sleep(2000);
		
		//Pincode
		driver.findElement(By.name("pincode")).sendKeys("500041");
		
		//Are you ready to relocate to bangalore?
		driver.findElement(By.name("checkbox-833[]")).click();
		Thread.sleep(2000);
		
		//submit
		//driver.findElement(By.className("wpcf7-form-control wpcf7-submit has-spinner btn btn-default")).click();
		//this should be handled with xpath as none of the locators are unique.
		
		//close the browser
		driver.quit();
	}

}
