package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Hoverover_Example1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[.='✕']")).click();
		
		WebElement shirt=driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(shirt).perform();		
	}

}
