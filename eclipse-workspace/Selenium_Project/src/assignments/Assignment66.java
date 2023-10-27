
//Launching Chrome Browser & Google website

package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment66 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

}
