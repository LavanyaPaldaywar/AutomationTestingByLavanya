
//Launch amazon.in and click on mobiles using relative xpath

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment77_A 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//mobiles link
		driver.findElement(By.xpath("(//a)[33]")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
