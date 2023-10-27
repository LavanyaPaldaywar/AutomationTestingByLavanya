package synchronization;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_With_ImplicitWait
{
	@Test
	public void noImplicitWait()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.get("https://www.amazon.in");
		
		System.out.println("Amazon is opened");
		
		driver.quit();
		
	}
}

//Time 6713
