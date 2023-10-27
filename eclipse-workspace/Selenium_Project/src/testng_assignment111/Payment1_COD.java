package testng_assignment111;


import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Payment1_COD extends LaunchAndQuit
{
	@Test
	
	public void COD() throws InterruptedException, EncryptedDocumentException, IOException
	{
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
		
		/*sign in to amazon by providing mobile number and password , then click on submit button
		driver.findElement(By.id("ap_email")).sendKeys("9553854848");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Amazonsai12345@");
		driver.findElement(By.id("signInSubmit")).click();*/
		
		//choosing address to deliver product
		driver.findElement(By.xpath("//span[.='Lavanya']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).click();
		
		Thread.sleep(3000);
		
		//reached to payment page
		System.out.println("Reached till payment page");
		
		Thread.sleep(7000);
		
		//selecting credit or debit card
		System.out.println("Choosing payment option");
		
		//Other UPI Apps
		WebElement upi = driver.findElement(By.xpath("(//div[@class='a-radio'])[9]"));
		upi.click();
		driver.findElement(By.name("__sif_encryptedVPA_collect")).sendKeys("lavanyatesting4@oksbi");
		driver.findElement(By.name("ppw-widgetEvent:ValidateUpiIdEvent")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")).click();
		System.out.println("UPI Payment option selected");
		
		Thread.sleep(20000);
	}
}

