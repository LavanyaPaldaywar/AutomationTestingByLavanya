package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrlInChromeBrowser 
{

	public static void main(String[] args) 
	{
		ChromeDriver c2 = new ChromeDriver();
		c2.get("https://www.google.com");
		System.out.println("google page is opened in chrome browser");
	}

}
