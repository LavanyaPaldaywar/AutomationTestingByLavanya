package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleFromFirefoxBrowser 
{

	public static void main(String[] args) 
	{
		FirefoxDriver d1 = new FirefoxDriver();
		d1.get("https://www.facebook.com");
		String title = d1.getTitle();
		System.out.println(title);
	}

}
