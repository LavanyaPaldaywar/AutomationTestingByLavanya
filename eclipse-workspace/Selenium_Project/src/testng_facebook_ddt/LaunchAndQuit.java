package testng_facebook_ddt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchAndQuit extends TestData
{
	ChromeDriver driver= new ChromeDriver();
	@BeforeMethod
	public void launch()
	{
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
