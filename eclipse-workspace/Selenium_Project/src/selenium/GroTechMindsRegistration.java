package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechMindsRegistration 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.name("your-name")).sendKeys("Lavanya");
		driver.findElement(By.id("2")).sendKeys("Lavanya");
		driver.findElement(By.id("3")).sendKeys("password");
		driver.findElement(By.id("4")).sendKeys("Lavanya");
		driver.findElement(By.id("5")).sendKeys("Paldaywar");
		driver.findElement(By.name("radio-45")).click();
		//driver.findElement(By.className("wpcf7-list-item-label")).click();
		//driver.findElement(By.className("wpcf7-form-control wpcf7-submit has-spinner btn btn-default")).click();
	}

}
