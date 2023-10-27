//syntax - //tagname[.='textmessgae']

package seleniumchrome_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_OpenAmazon_XPathLocator_TextMessage 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Sell']")).click();
		
	}

}
