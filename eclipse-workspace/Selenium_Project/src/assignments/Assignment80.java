
//Launch amazon and reach till payment page

package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment80 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Launch chrome
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				//Launch amazon
				driver.get("https://www.amazon.in");
				Thread.sleep(2000);
				
				driver.navigate().refresh();
				Thread.sleep(2000);
				
				driver.navigate().refresh();
				Thread.sleep(2000);
				
				//Search item in amazon search
				WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
				searchbox.sendKeys("toys");
				searchbox.sendKeys(Keys.ENTER);
				
				//Choosing first item from list of items and hence opens child window
				WebElement item =driver.findElement(By.xpath("(//img[@class='s-image'])[2]"));
				item.click();
				
				//storing parent browser id and child browser id in ids variable
				Set<String> ids = driver.getWindowHandles();
				System.out.println(ids);
				
				//Separating parent id and child id and storing them separately in parent and child variables
				Iterator<String> firstchildhandling = ids.iterator();
				String parent = firstchildhandling.next();
				String child = firstchildhandling.next();
				System.out.println(parent); //parent
				System.out.println(child); //child
				
				//switching control from parent to child using browser id
				driver.switchTo().window(child);
				
				Thread.sleep(3000);
				
				//adding item to cart
				WebElement addtocart =driver.findElement(By.id("add-to-cart-button"));
				Thread.sleep(1000);
				addtocart.click();
				
				//proceed to buy
				WebElement proceedtobuy = driver.findElement(By.name("proceedToRetailCheckout"));
				proceedtobuy.click();
				
				//sign in to amazon by providing mobile number and password , then click on submit button
				driver.findElement(By.id("ap_email")).sendKeys("9553854848");
				driver.findElement(By.id("continue")).click();
				driver.findElement(By.id("ap_password")).sendKeys("Amazonsai12345@");
				driver.findElement(By.id("signInSubmit")).click();
				
				//choosing address to deliver product
				driver.findElement(By.xpath("//span[.='Lavanya']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).click();
				
				Thread.sleep(3000);
				
				//reached to payment page
				System.out.println("Reached till payment page");
				
				Thread.sleep(7000);
				
				System.out.println("Choosing payment option");
				
				//=====Cash On Delivery
				WebElement COD = driver.findElement(By.xpath("(//div[@class='a-radio'])[10]"));// --->working
				COD.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent'])[1]")).click();
				System.out.println("Payment option selected");
				
				
				/*====Net Banking
				WebElement NetBanking =driver.findElement(By.xpath("(//span[.='Net Banking'])[1]"));
				NetBanking.click();
				WebElement dropdown = driver.findElement(By.xpath("//select[@name='ppw-bankSelection_dropdown']"));
				//dropdown.click();
				Thread.sleep(2000);
				Select s1 = new Select(dropdown);
				s1.selectByIndex(3);
				Thread.sleep(3000);
				driver.findElement(By.name("ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")).click();
				System.out.println("Payment option selected");
				*/
				
				/*=====Other UPI Apps
				WebElement upi = driver.findElement(By.xpath("(//div[@class='a-radio'])[9]"));
				upi.click();
				driver.findElement(By.name("__sif_encryptedVPA_collect")).sendKeys("lavanyatesting4@oksbi");
				driver.findElement(By.name("ppw-widgetEvent:ValidateUpiIdEvent")).click();
				Thread.sleep(3000);
				driver.findElement(By.name("ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")).click();
				System.out.println("Payment option selected");
				*/
				
				/*=====Credit or debit card
				WebElement card = driver.findElement(By.xpath("(//div[@class='a-radio'])[8]"));
				card.click();
				//clicking on + to add card details
				driver.findElement(By.xpath("//img[@class='apx-add-pm-trigger-common-image']")).click();
				driver.findElement(By.name("addCreditCardNumber")).sendKeys("4017 0434 3509 2658");
				Thread.sleep(1000);
				driver.findElement(By.name("ppw-accountHolderName")).clear();
				driver.findElement(By.name("ppw-accountHolderName")).sendKeys("paldaywar lavanya");
				
				//month
				WebElement month = driver.findElement(By.name("//select[@name='ppw-expirationDate_month']"));
				month.click();
				Select s1 = new Select(month);
				s1.selectByIndex(4);
				
				//year
				WebElement year = driver.findElement(By.name("//select[@name='ppw-expirationDate_year']"));
				year.click();
				Select s2 = new Select(year);
				s2.selectByIndex(7);
				*/
				
	}

}
