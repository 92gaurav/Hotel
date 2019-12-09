package Inner_modules;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class B_properties extends A_login {
	
	
	public void property() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Click to Property");
		// Click to Property
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
		// Now clicking the Property information in Property
		
		System.out.println("Click to Property information");
		driver.findElement(By.xpath("//span[contains(text(),'Property Information')]")).click();
		((JavascriptExecutor)driver).executeScript("scroll(0,document.body.scrollHeight)");
		System.out.println("First link Successfull clicked");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'DESCRIPTION')]")).click();
		System.out.println("Second link Successfully clicked");
		((JavascriptExecutor)driver).executeScript("scroll(0,document.body.scrollHeight)");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'IMAGES')]")).click();
		System.out.println("Third link Successfull clicked");
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		//Thread.sleep(2000);	
		driver.navigate().back();
		System.out.println("Back to Property");
		//Thread.sleep(3000);

		// Now Clicking the default settings in Property
		System.out.println();
		System.out.println("Click to Default Settings");

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Default Settings')]")).click();
		System.out.println("First link successfully clicked");
		//Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//div[contains(text(),'CHECK IN / OUT')]")).click();
		System.out.println("Second link successfully clicked");
		//Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//div[contains(text(),'HOUSE KEEPING SETTINGS')]")).click();
		System.out.println("Third  link successfully clicked");
		//Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//div[contains(text(),'GUEST CATEGORIES')]")).click();
		System.out.println("Fourth link succesfully clicked");
		//Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		driver.navigate().back();
		System.out.println("Back to property");
		//Thread.sleep(3000);

		// Now clicking the Accounting in Property
		System.out.println();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
		System.out.println("Click to Accounting");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		//Thread.sleep(2000);
		System.out.println("Show All Active Ledger Cattegory");
		driver.findElement(By.xpath("//div[@class='Ledgers__textRight__3ruhe col-md-6']//div//button[@id='dropdown-size-large']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Inactive Ledger Category')]")).click();
		//Thread.sleep(2000);
		System.out.println("Show all Inactive Ledger category");
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//div[@class='panel-title'][contains(text(),'LEDGERS')]")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		System.out.println("Show All Active Ledger");
		////Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='Ledgers__textRight__3ruhe col-md-8']//div[@class='pull-right btn-toolbar']//button[@id='dropdown-size-large']")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//span[contains(text(),'Inactive Ledgers')]")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		////Thread.sleep(2000);
		System.out.println("Show All Inactive Ledger");
		driver.navigate().back();
		////Thread.sleep(3000);
		System.out.println();
		System.out.println("Property section is complete");

	}

	

}