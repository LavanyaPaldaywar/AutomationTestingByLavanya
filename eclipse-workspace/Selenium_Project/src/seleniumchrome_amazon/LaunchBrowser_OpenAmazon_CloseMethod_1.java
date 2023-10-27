//close() is used to close the parent browser or the browser which has control.
//close() return type is void and comes from org.openqa.selenium.remote.RemoteWebDriver.close() package.

package seleniumchrome_amazon;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_OpenAmazon_CloseMethod_1
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(30000);
		driver.close();
		//Thread.sleep(30000);
		//ChromeDriver driver1 = new ChromeDriver();
		//driver1.get("https://www.amazon.in");
	}

}
