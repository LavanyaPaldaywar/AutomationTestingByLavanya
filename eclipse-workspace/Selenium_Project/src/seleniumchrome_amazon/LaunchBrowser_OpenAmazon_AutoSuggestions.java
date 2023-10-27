package seleniumchrome_amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_OpenAmazon_AutoSuggestions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement searchfield =driver.findElement(By.id("twotabsearchtextbox"));
		searchfield.sendKeys("Toys");
		Thread.sleep(3000);
		
		List<WebElement> autos = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		int count=autos.size();
		System.out.println(count);
		autos.get(2).click();
	}

}
