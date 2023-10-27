package testng_assignment97;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchAndQuit 
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
