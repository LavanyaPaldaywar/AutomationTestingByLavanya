package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Shoe_Example 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement a=driver.findElement(By.xpath("//a[.='Canada']"));
		)
	}

}
