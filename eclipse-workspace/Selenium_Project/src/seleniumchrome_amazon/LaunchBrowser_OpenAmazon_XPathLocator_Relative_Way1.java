//In relative xpath we traverse to any component directly
//syntax: //tagname

package seleniumchrome_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_OpenAmazon_XPathLocator_Relative_Way1 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a)[30]")).click();//relative xpath of Amazon miniTv
		driver.findElement(By.xpath("(//span)[2]")).click();//relative xpath of short Films
	}

}
