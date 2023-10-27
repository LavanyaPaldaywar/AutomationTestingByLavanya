package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleFlipkart 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
	WebElement searchtf=	driver.findElement(By.name("q"));
	searchtf.sendKeys("shoe");
	
	}

}
