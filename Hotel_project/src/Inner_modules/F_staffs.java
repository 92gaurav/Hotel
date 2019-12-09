package Inner_modules;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

public class F_staffs extends E_guests{
	
	
public void staff() throws InterruptedException {
		
		System.out.println("WellCome to Staff Section");
		driver.findElement(By.xpath("//span[contains(text(),'Staff')]")).click();
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
       	Thread.sleep(9000);
       	((JavascriptExecutor)driver).executeScript("scroll(0,document.body.scrollHeight)");
       	driver.findElement(By.xpath("//body//div[@id='root']//div//div//div//div[@class='container App__container__4uEyK']//div//div[@class='row']//div[2]//div[1]//div[1]//div[1]//button[1]")).click();
       	Thread.sleep(5000);
       	driver.findElement(By.xpath("//body//div[@id='root']//div//div//div//div[@class='container App__container__4uEyK']//div//div[@class='row']//div[2]//div[1]//div[1]//div[1]//button[1]")).click();
       	System.out.println("Show All Staff Members");
       	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
       	System.out.println("Show all Acive Staff Members");
       	driver.findElement(By.xpath("//a[contains(text(),'Inactive Staff Members')]")).click();
       	Thread.sleep(2000);
       	((JavascriptExecutor)driver).executeScript("scroll(0,document.body.scrollHeight)");
       	driver.navigate().back();
       	System.out.println("Back to Home Page");
		
	}

}