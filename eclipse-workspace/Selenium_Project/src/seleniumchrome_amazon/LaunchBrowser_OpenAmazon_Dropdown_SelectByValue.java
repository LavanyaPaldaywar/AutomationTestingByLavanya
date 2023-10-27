package seleniumchrome_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser_OpenAmazon_Dropdown_SelectByValue 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		dropdown.click();
		Thread.sleep(2000);
		
		Select s1 = new Select(dropdown);
		s1.selectByValue("search-alias=fashion"); //capture value from html code - for Amazon Fashion
	}

}
