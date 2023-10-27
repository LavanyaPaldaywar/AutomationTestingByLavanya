package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng_Basic_Program
{
	@Test
	public void testcase1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	

}
