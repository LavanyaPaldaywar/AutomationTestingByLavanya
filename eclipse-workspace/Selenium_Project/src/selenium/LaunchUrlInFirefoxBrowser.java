package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchUrlInFirefoxBrowser 
{

	public static void main(String[] args) 
	{
		FirefoxDriver f2 = new FirefoxDriver();
		f2.get("https://www.facebook.com");
	}

}
