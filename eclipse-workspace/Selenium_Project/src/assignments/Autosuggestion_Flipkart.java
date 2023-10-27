
//Launch flipkart.com and type shoe and locate autosuggestion and select any one

package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Flipkart 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		//close popup
		driver.findElement(By.xpath("//span[.='✕']")).click();
		Thread.sleep(3000);
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("shoe");
		
		Thread.sleep(2000);
		
		//Pause the screen - rightclick-> inspect -> sources -> pause -> search with any autosuggestion text
		List<WebElement> autosuggestion =driver.findElements(By.xpath("(//div[@class='_3NorZ0'])/form/ul/li"));
		int count=autosuggestion.size();
		System.out.println(count);
		
		Thread.sleep(2000);
		
		autosuggestion.get(1).click();
		
		
		
		
	}

}
