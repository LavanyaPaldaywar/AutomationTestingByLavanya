
//Launch Amazon.in and type shoe using relative xpath formula

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment77_F 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoe");
	}

}
