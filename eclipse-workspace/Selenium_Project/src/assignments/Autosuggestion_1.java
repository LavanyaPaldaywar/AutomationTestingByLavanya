
//Launch google.com and type India and locate autosuggestions

package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		WebElement searchtextbox = driver.findElement(By.name("q"));
		searchtextbox.sendKeys("India");
		
		Thread.sleep(2000);
		
		List<WebElement> autosuggestion =driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int countofautosuggestions = autosuggestion.size(); //size of autosuggestion
		System.out.println(countofautosuggestions);
		
		Thread.sleep(5000);
		
		//autosuggestion.get(1).click(); //to select element in 1st position means index is 1.
		autosuggestion.get(countofautosuggestions-9).click();
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
