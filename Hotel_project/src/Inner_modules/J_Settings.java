package Inner_modules;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class J_Settings extends I_Dashboards {
	

public void setting_dropdown() throws InterruptedException {
		
	try {
		driver.findElement(By.xpath("//span[text()='hotel admin']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Change Password')]")).click();
		System.out.println("Click to Change Password");
		
		System.out.println("Move to PopUp");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(2000);
		}
	catch(ElementClickInterceptedException e) {
		
		System.out.println(e);
	}
	
		driver.findElement(By.xpath("//span[text()='hotel admin']")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Hotel California')]")).click();
		Thread.sleep(2000);
		System.out.println("Click to Hotel California");
		
		driver.findElement(By.xpath("//span[text()='hotel admin']")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Livpool')]")).click();
		Thread.sleep(2000);
		System.out.println("Click to Livpool");
		
		driver.findElement(By.xpath("//span[text()='hotel admin']")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Parent Hotel')]")).click();
		System.out.println("Click to Parent Hotel");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='hotel admin']")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Musterhotel')]")).click();
		System.out.println("Click on Musterhotel");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='hotel admin']")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Add Another hotel')]")).click();
		System.out.println("Click on Add Another Hotel");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0,document.body.scrollHeight)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id='Login-layout-lang-dropdown']")).click();
		System.out.println("Click on Login Layout Language");
		driver.findElement(By.xpath("//a[contains(text(),'German')]")).click();
		System.out.println("Click to German Language");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='Login-layout-lang-dropdown']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
		System.out.println("Click to English Language");
		
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Clicked on Back Button");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='fa fa-th']")).click();
		System.out.println("Back to Dashboard");
		driver.findElement(By.xpath("//span[@class='caret']")).click();
		driver.findElement(By.xpath("//a[@role='menuitem'][contains(text(),'English')]")).click();
		Thread.sleep(3000);
		System.out.println("Rechecked Language and Select to English");
		System.out.println();
		System.out.println("Its Time to LogOut");
	    driver.findElement(By.xpath("//span[@class='fa fa-power-off']")).click();
	    Thread.sleep(2000);
	    driver.close();
		
	}

}