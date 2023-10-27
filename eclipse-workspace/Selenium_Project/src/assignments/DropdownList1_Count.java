
//Launch amazon and locate dropdown and find the number of options in dropdown

package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList1_Count 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement search=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select s1 = new Select(search);
		List<WebElement> optionslist = s1.getOptions();
		int count = optionslist.size();
		System.out.println(count);
	}

}
