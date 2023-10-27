
//Which exception will come if javascript popup is not present but handled


package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_IfJavascriptPopupNotPresentButHandled_1
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lavan/OneDrive/Desktop/learningHTML1%20(1).html");
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("1")).sendKeys("lavanya");
	}

}

//org.openqa.selenium.NoAlertPresentException