package synchronization;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_WithOut_ImplicitWait
{
	@Test
	public void noImplicitWait()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		System.out.println("Amazon is opened");
		
		driver.quit();
		
	}
}

//Time taken 6405