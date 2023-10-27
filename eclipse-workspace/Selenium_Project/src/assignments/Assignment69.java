
//Use Quit Method to close Parent and Child Browsers

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment69 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//search for shoe
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		
		//clicking search icon
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//selecting first shoe
		driver.findElement(By.linkText("Mens Shuttle Walking Shoe")).click();	
		Thread.sleep(2000);
		
		//using quit to close parent and child browser windows
		driver.quit();
	}

}
