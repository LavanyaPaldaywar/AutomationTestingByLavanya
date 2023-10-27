package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath_Example1 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//textarea)[1]")).sendKeys("India");
	}

}
