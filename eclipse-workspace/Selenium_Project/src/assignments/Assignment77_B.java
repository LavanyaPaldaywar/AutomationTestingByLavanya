
//Locate each and every component in JSAM using relative xpath

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment77_B 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lavan/OneDrive/Desktop/learningHTML1%20(1).html");
		
		//Username
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Lavanya");
		
		//Hint
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Lav");
		
		//Password
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Lavanya");
		
		//Your First name
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("firstname");
		
		//Your Last name - disabled
		//driver.findElement(By.xpath("(//input)[5]")).sendKeys("lastname");
		
		//submit of first form
		//driver.findElement(By.xpath("(//input)[6]")).click();
		Thread.sleep(2000);
		
		// I have a Boy
		driver.findElement(By.xpath("(//input)[7]")).click();
		
		// I have a Girl
		driver.findElement(By.xpath("(//input)[8]")).click();
		
		// I have a Baby
		driver.findElement(By.xpath("(//input)[9]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[9]")).click();
		
		//submit of second form
		//driver.findElement(By.xpath("(//input)[10]")).click();
		Thread.sleep(2000);
		
		//Who Are You: Male or Female
		driver.findElement(By.xpath("(//input)[12]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[12]")).click();
		
		//Are you ready to relocate to bangalore?
		driver.findElement(By.xpath("(//input)[13]")).click();
		Thread.sleep(2000);

		//Signup - it is disabled
		driver.findElement(By.xpath("(//input)[14]")).click();
		Thread.sleep(5000);
		
		//closing the browser using quit
		//driver.quit();		
		
		
	}

}
