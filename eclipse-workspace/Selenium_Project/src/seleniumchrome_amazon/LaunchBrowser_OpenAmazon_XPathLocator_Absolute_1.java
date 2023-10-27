//Absolute Xpath - traverse from parent tag to child tag

package seleniumchrome_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_OpenAmazon_XPathLocator_Absolute_1
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(((/html/body/div/header/div/div)[5]/div)[2]/div/div/a)[1]")).click(); //absolute xpath of Amazon miniTV
		driver.findElement(By.xpath("((/html/body/div/div/div/nav/div)[2]/a)[3]")).click();//absolute xpath of short films
	}

}
