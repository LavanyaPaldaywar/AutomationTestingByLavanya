
////Launch amazon.in and locate dropdown and select dropdown options using selectbyindex


package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1_SelectByIndex 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launch amazon.in
		driver.get("https://www.amazon.in/");
		
		//Finding and locating dropdown
		WebElement Dropdown = driver.findElement(By.xpath("//select[@name='url']"));
		//Dropdown.click();
		
		Thread.sleep(3000);
		
		Select s1 = new Select(Dropdown);
		s1.selectByIndex(11);//index starts from 0
		
		Thread.sleep(8000);
		//driver.quit();
	}

}
