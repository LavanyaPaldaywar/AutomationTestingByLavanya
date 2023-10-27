
//Which exception will come if javascript popup is not handled

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_IfJavascriptPopupNotHandled_1 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lavan/OneDrive/Desktop/learningHTML1%20(1).html");
		
		driver.findElement(By.id("1")).sendKeys("lavanya");
		
	}

}
//popup is not handled
// popup goes away but sendkeys action will not be performed , 
//it throws org.openqa.selenium.UnhandledAlertException