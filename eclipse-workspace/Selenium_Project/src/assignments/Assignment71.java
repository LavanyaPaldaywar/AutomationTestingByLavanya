
//Try to login facebook by using id and name Locator .

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment71 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abcd");
		driver.findElement(By.name("login")).click();
		System.out.println("Facebook Login");
		
	}

}
