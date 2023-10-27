
//Launch GTM registration page and type something in username , then copy and paste in other textfields

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunctionality_2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		WebElement username= driver.findElement(By.id("1"));
		username.sendKeys("Lavanya");
		
		Thread.sleep(2000);
		
		username.sendKeys(Keys.CONTROL+"A");
		username.sendKeys(Keys.CONTROL+"C");
		
		Thread.sleep(2000);
		
		WebElement password= driver.findElement(By.id("3"));
		password.sendKeys(Keys.CONTROL+"V");
		
		Thread.sleep(2000);
		
		WebElement firstname= driver.findElement(By.id("4"));
		firstname.sendKeys(Keys.CONTROL+"V");
		
		Thread.sleep(2000);
		
		WebElement lastname= driver.findElement(By.id("5"));
		lastname.sendKeys(Keys.CONTROL+"V");
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
