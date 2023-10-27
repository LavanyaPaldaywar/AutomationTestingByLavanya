package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToAmazon 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.id("ap_email")).sendKeys("abc@gmail.com"); //id locator
		driver.findElement(By.name("password")).sendKeys("abc"); // name locator
		driver.findElement(By.id("signInSubmit")).click(); // id locator
	}

}
