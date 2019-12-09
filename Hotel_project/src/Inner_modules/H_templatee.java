package Inner_modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class H_templatee extends G_poss  {
	
	public void template_designer()  {
	    try {
				Thread.sleep(2000);
			
			System.out.println("WellCome to Teplate Designer");
			driver.findElement(By.xpath("//span[contains(text(),'Template Designer')]")).click();
			System.out.println("Click on Template Designer");
	        driver.findElement(By.xpath("//span[contains(text(),'Templates')]")).click();
	        System.out.println("Click on Template");
	       	((JavascriptExecutor)driver).executeScript("scroll(0,document.body.scrollHeight)");
	       	Thread.sleep(3000);
			System.out.println("ShoW All Template");
			driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Email Templates')]")).click();
			System.out.println("Click On Email Templates");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Offer Templates')]")).click();
			System.out.println("Click on Offer Template");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Reservation Templates')]")).click();
			System.out.println("Click on Reservation Templates");
			Thread.sleep(2000);
			driver.navigate().back();
			
		    driver.findElement(By.xpath("//span[contains(text(),'Template Designer')]")).click();
		    driver.findElement(By.xpath("//span[contains(text(),'Text Modules')]")).click();
		    System.out.println("Show All Active Modules");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();

		    driver.findElement(By.xpath("//span[contains(text(),'Inactive Module')]")).click();
		    System.out.println("Show All Inactive Module");
		    Thread.sleep(3000);
		    driver.navigate().back();
	} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		}
}
