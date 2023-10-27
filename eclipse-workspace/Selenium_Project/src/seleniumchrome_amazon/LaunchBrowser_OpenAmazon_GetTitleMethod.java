//To launch empty chrome browser and open amazon.in and maximize browser and get title of the page
//getTitle() is used to get the title of the page and return type is String and from org.openqa.selenium.remote.RemoteWebDriver package

package seleniumchrome_amazon;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_OpenAmazon_GetTitleMethod 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		String Title = driver.getTitle();//gives the title of the page
		System.out.println(Title);//prints the title of the page in console
	}

}
