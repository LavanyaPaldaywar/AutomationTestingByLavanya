//To copy value from one text field and paste into other text fields
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		WebElement UserName=driver.findElement(By.id("1"));
		UserName.sendKeys("Lavanya");
		UserName.sendKeys(Keys.CONTROL+"a");
		UserName.sendKeys(Keys.CONTROL+"c");
		
		WebElement Hint=driver.findElement(By.id("2"));		
		Hint.sendKeys(Keys.CONTROL+"v");
		
		WebElement Password=driver.findElement(By.id("3"));
		Password.sendKeys(Keys.CONTROL+"v");
		
		WebElement YourFirstName=driver.findElement(By.id("4"));
		YourFirstName.sendKeys(Keys.CONTROL+"v");
		
		WebElement YourLastName=driver.findElement(By.id("5"));
		YourLastName.sendKeys(Keys.CONTROL+"v");
		
	}

}
