//PartialLinkText locator is used to locate the links by providing the partial text(should be unique)

package seleniumchrome_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_OpenAmazon_PartialLinkTextLocator 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("miniTV")).click(); 
	}

}
