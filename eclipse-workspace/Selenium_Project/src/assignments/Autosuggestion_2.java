
//Launch amazon.in and type shoe and locate autosuggestions and choose shoe rack for home

package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		WebElement searchtextfield =driver.findElement(By.id("twotabsearchtextbox"));
		searchtextfield.sendKeys("shoe");
		
		Thread.sleep(2000);
		
		List<WebElement> autosuggestions=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=autosuggestions.size();
		System.out.println(count);
		
		Thread.sleep(2000);
		
		autosuggestions.get(2).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	
	}

}
