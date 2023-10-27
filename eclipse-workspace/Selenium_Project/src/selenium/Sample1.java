package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		Thread.sleep(3000);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_UP);
		search.sendKeys(Keys.ENTER);
	}

}
