package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleFromChromeBrowser 
{

	public static void main(String[] args) 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.google.com");
		String title = c1.getTitle();
		System.out.println(title);
	}

}
