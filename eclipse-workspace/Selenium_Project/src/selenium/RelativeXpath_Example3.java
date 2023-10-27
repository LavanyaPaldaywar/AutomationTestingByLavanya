package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath_Example3
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Lavanya"); //username
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Lavanya"); //password
		driver.findElement(By.xpath("//button")).click();		
	}

}
