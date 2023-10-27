
//Launch google and type India using relative xpath 

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment77_C 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("(//textarea)[1]")).sendKeys("India");
	}

}
