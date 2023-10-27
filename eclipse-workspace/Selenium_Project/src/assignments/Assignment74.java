
//Try to login Amazon.in then click on searchbox,search shoe and the click on search button. Then click on first result.

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment74 
{

	public static void main(String[] args) 
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
	}

}
