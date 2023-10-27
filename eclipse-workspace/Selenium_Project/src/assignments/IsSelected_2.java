package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lavan/OneDrive/Desktop/learningHTML1%20(1).html");
		
		WebElement checkbox =driver.findElement(By.xpath("(/html/body/input)[6]"));
		boolean first =checkbox.isSelected();
		System.out.println(first);
		
		Thread.sleep(2000);
		checkbox.click();
		
		Thread.sleep(2000);
		boolean second =checkbox.isSelected();
		System.out.println(second);
		
	}

}
