package Inner_modules;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

public class I_Dashboards extends H_templatee{
	

public void  home_page() throws InterruptedException {
		
		System.out.println("WellCome to HomePage");
		driver.findElement(By.xpath("//span[@class='fa fa-th']")).click();
		System.out.println("Click to Dashboard");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/nav/div/div[2]/ul[1]/li[2]/a/span")).click();
		Thread.sleep(8000);
		((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		System.out.println("Show Front Desk");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/nav/div/div[2]/ul[1]/li[3]/a/span")).click();
		System.out.println("WellCome to Room Service Portal Layout");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div/div/div/div[@class='App__container__4uEyK']/div[@class='container']/div[@class='text-center']/div[1]/div[1]/div[1]")).click();
		System.out.println("Click to Items");
		driver.findElement(By.xpath("//li[contains(text(),'Items List')]")).click();
		System.out.println("Click to Item List");
		Thread.sleep(2000);
		System.out.println("Show All Active Items");
		driver.findElement(By.xpath("//*[@id=\"dropdown-size-large\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'InActive Items')]")).click();
		System.out.println("Show All Inactive Items");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[3]/div/div/div[1]/div/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[3]/div/div/div[1]/div/div[1]/div[2]/ul/li[2]")).click();
		System.out.println("Click to Items Category");
		Thread.sleep(2000);
		
		System.out.println("Show All Active Item");
		driver.findElement(By.xpath("//*[@id=\"dropdown-size-large\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'InActive Items')]")).click();
		System.out.println("Show All Inactive Items");
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("WellCome to Order");
		driver.findElement(By.xpath("//body/div[@id='root']/div/div/div/div[@class='App__container__4uEyK']/div[@class='container']/div[@class='text-center']/div[2]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//li[@class='Dashboard__options_li__1xQ8E']")).click();
		System.out.println("CLick to Order List");
		Thread.sleep(2000);
		
		System.out.println("Show Order");
		driver.findElement(By.xpath("//button[text()='next']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[3]/div/div/div[3]/div/div[2]/div/button")).click();
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/nav/div/div[2]/ul[1]/li[3]/a")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-th']")).click();
		Thread.sleep(2000);
		System.out.println("Click to Language");
		driver.findElement(By.xpath("//span[@class='caret']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'German')]")).click();
		System.out.println("Selecting German Language");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='caret']")).click();
		driver.findElement(By.xpath("//a[@role='menuitem'][contains(text(),'English')]")).click();
		System.out.println("Show English language ");
		driver.findElement(By.xpath("//li[@class='active']//a[@action='push']"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='helpIcon']")).click();
		Thread.sleep(2000);
		System.out.println("Click to Help");
		driver.findElement(By.xpath("//span[@class='fa fa-times']")).click();
		System.out.println("CLosed Help Slider");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='Navigation__custombellImage__17ZIM']")).click();
		System.out.println("Click on Bell Icon");
		System.out.println("Back to Home Page");
		
		
	}

}