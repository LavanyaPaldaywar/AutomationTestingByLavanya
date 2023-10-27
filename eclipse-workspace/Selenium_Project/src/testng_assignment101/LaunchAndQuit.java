package testng_assignment101;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	public void screenshotandquit() throws IOException, InterruptedException
	{
		TakesScreenshot s1 = driver;
		File f1 = s1.getScreenshotAs(OutputType.FILE);//SOURCE
		File object = new File("C:\\Users\\lavan\\eclipse-workspace\\Selenium_Project\\Screenshot\\Assignment101_Payment" + Math.random() + ".png");
		FileUtils.copyFile(f1, object);
		
		Thread.sleep(10000);
		driver.quit();
	}
}
