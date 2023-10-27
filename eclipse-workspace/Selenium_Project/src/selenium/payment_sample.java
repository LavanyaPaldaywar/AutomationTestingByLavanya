driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement shoe=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		shoe.click();
		Set<String>parentchild=driver.getWindowHandles();
		Iterator<String> count=parentchild.iterator();
		String parent=count.next();
		String child=count.next();
addtocart.click();
		WebElement proceedtobuy=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		proceedtobuy.click();
		WebElement login=driver.findElement(By.id("ap_email"));
		login.sendKeys("sayunavgire@gmail.com");
		WebElement submit=driver.findElement(By.id("continue"));
		submit.click();
		WebElement pw=driver.findElement(By.name("password"));
		pw.sendKeys("Sayali@1804");
		WebElement submit2=driver.findElement(By.id("signInSubmit"));
		submit2.click();
		WebElement address=driver.findElement(By.id("shipToThisAddressButton"));
		address.click();
@Test
	public void Creditcard() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement creditcard=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[2]"));
		creditcard.click();
		WebElement creditcardlink=driver.findElement(By.xpath("(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]"));
		creditcardlink.click();
	}
}