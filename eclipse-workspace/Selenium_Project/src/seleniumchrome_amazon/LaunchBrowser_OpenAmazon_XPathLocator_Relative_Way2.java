//In relative xpath we traverse to any component directly
//syntax: //tagname[@AttributeName='AttributeValue'];

package seleniumchrome_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_OpenAmazon_XPathLocator_Relative_Way2 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]")).click();//relative xpath of Amazon miniTv using formula
		driver.findElement(By.xpath("(//span[@class=' AppNavbar_navItem___QI5L'])[2]")).click();//relative xpath of short Films using formula
	}

}
