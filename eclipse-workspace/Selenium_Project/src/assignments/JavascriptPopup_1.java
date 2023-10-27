
//Launch GTM registration page and handle javascript popup

package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopup_1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
	}

}
