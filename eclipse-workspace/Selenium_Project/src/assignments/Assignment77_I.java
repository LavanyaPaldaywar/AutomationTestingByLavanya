
//Launch google.com and click on gmail text message using text message xpath formula

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment77_I 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//gmail text message
		driver.findElement(By.xpath("//a[.='Gmail']")).click();
		
	}

}
