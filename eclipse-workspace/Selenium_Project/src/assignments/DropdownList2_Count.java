
//Launch GTM registration page and find the count of country dropdown options

package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList2_Count 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/registration/");
		
		Thread.sleep(5000);
		
		WebElement dd =driver.findElement(By.xpath("//select[@name='country']"));
		
		Select s1 = new Select(dd);
		List<WebElement> listofdd = s1.getOptions();
		System.out.println(listofdd.size());
	}

}
