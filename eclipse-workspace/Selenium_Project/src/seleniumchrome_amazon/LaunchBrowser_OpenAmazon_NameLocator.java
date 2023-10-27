//name locator helps to locate element using name attribute

package seleniumchrome_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_OpenAmazon_NameLocator 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&prevRID=30413VAME31KK8NT84VK&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.name("customerName")).sendKeys("Lavanya");//Your Name
		driver.findElement(By.name("email")).sendKeys("90000000009");//Mobile Number
		driver.findElement(By.name("secondaryLoginClaim")).sendKeys("abc@gmail.com");//Email
		driver.findElement(By.name("password")).sendKeys("Lavanya");//password
		driver.findElement(By.id("continue")).click();//using id as there is no name attribute
		Thread.sleep(2000);
		driver.close();
	}

}
