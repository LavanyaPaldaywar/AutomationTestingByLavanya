
//Launching ChromBrowser with GetwindowHandle and GetwindowHandles.

package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment70 
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
		
		//getting browser id's
		String Parent = driver.getWindowHandle();
		System.out.println(Parent);
		
		Set<String> ParentAndChild =driver.getWindowHandles();
		System.out.println(ParentAndChild);
	}
}
