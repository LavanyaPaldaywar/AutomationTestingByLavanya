
//Launch Google and click on gmail link using absolute xpath

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment76_A 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//gmail link 
		driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div)[1]")).click();
		Thread.sleep(3000);

		driver.quit();
	}

}
