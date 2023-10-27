package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFacebook 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com"); //id locator
		driver.findElement(By.id("pass")).sendKeys("abc"); //id locator
		driver.findElement(By.name("login")).click(); // name locator;
	}

}
