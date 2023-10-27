//getWindowHandle() gives the browser id of parent browser or the browser that has control
//getWindowHandle() return type is string and comes from org.openqa.selenium.remote.RemoteWebDriver.getWindowHandle() package

package seleniumchrome_amazon;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_OpenAmazon_GetWindowHandleMethod_1 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		String browserid = driver.getWindowHandle(); //gives browser id of parent browser.
		System.out.println(browserid);
	}

}
