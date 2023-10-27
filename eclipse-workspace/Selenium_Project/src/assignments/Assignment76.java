
//Try to locate each and every component of that Html page by using Xpath Locator(Absolute).

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment76 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/lavan/OneDrive/Desktop/learningHTML1%20(1).html");
		
		//username
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Lavanya");
		
		//hint
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Lav");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(/html/body/input)[2]")).clear();
		
		//Password
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Lavanya");
		
		//Your First name
		driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]")).sendKeys("Firstname");
		Thread.sleep(2000);
		
		//Your Last name , this element is disabled
		//driver.findElement(By.xpath("((/html/body/form)[1]/input)[2]")).sendKeys("Lastname");
		
		//submit of first form
		//driver.findElement(By.xpath("((/html/body/form)[1]/input)[3]")).click();
		Thread.sleep(2000);
		
		// I have a Boy
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")).click();
		
		// I have a Girl
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();
		
		// I have a Baby
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]")).click();
		
		//submit of second form
		//driver.findElement(By.xpath("((/html/body/form)[2]/input)[4]")).click();
		Thread.sleep(2000);
		
		//Who Are You: Male or Female
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		
		//Are you ready to relocate to bangalore?
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();
		Thread.sleep(2000);

		//Signup - it is disabled
		driver.findElement(By.xpath("(/html/body/input)[7]")).click();
		Thread.sleep(5000);
		
		//closing the browser using quit
		//driver.quit();		
	}

}
