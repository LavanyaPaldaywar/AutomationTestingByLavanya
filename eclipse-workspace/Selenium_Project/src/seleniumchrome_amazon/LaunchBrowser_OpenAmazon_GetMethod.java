//To launch empty chrome browser and open amazon.in
//get() is used to open url , return type is void and from package org.openqa.selenium.remote.RemoteWebDriver.get(String url)

package seleniumchrome_amazon;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_OpenAmazon_GetMethod 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver(); //Launches empty chrome browser
		driver.get("https://www.amazon.in"); //Opens amazon.in url in chrome browser
	}

}
