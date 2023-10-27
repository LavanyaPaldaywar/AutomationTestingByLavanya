package seleniumchrome_amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser_OpenAmazon_DropdownListCount 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s1 = new Select(dropdown);
		List<WebElement> count = s1.getOptions();
		System.out.println(count.size());
		
	}

}
