
//Launch google and type india and click enter key

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunctionality_1 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement searchtextfield=driver.findElement(By.name("q"));
		searchtextfield.sendKeys("India");
		searchtextfield.sendKeys(Keys.ENTER);
	}

}
