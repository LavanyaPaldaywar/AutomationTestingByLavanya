//To launch empty chrome browser and open amazon.in and maximize browser
//manage() return type is Options and comes from org.openqa.selenium.remote.RemoteWebDriver.manage() package
//window() return type is Window and comes from org.openqa.selenium.WebDriver.Options.window() package
//maximize() return type is void and comes from org.openqa.selenium.WebDriver.Window.maximize() package

package seleniumchrome_amazon;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_OpenAmazon_MaximizeBrowser 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize(); // to maximize browser
	}

}
