
////Launch JSAM and automate the religion dropdown using selectbyvalue

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2_SelectByValue 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lavan/OneDrive/Desktop/learningHTML1%20(1).html");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='Relegion']"));
		
		Select s1 = new Select(dropdown);
		s1.selectByValue("3");
	}

}
