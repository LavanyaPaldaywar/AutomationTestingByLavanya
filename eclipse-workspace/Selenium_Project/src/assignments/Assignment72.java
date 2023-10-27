
//Try to login Amazon.in then click on mobiles/sell tab by using Linktext locator.


package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment72 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("ap_email")).sendKeys("953465767787898");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Amazon@@@@@@");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sell")).click();	
	}
}
