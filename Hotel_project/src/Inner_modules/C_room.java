package Inner_modules;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

public class C_room extends B_properties {
	

	
	public void room() throws InterruptedException {

		System.out.println();
		System.out.println("Lets start with ----> Room");
		System.out.println("Click to Room");
		driver.findElement(By.xpath("//div[@class='Dashboard__toggle_my__BNcLM']//span[@class='fa fa-caret-down']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Amenities')]")).click();
		System.out.println("First link is Succefully clicked");
		Thread.sleep(2000);
		System.out.println("Show all active Amenities");
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");

		driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Inactive Amenities')]")).click();
		System.out.println("Shows all inactive Amenities");
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Back to Rooms");
		System.out.println();
		System.out.println("Click to Rooms");
		// try {
		driver.findElement(By.xpath("//span[contains(text(),'Rooms')]")).click();
		Thread.sleep(2000);
		System.out.println("Click to Room Type");
		driver.findElement(By.xpath("//span[contains(text(),'Room Types')]")).click();

		// }
		// catch(NoSuchElementException e){

		// System.out.println(e);
		// }
		System.out.println("First link successfully clicked");
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
		System.out.println("Show all Active Types");
		Thread.sleep(2000);
		// try {
		driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();
		// }
		// catch(NoSuchElementException e){
		// System.out.println(e);
		// }

		Thread.sleep(3000);
		System.out.println("yes");
		driver.findElement(By.xpath("//span[contains(text(),'Inactive Room types')]")).click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		System.out.println("Show all Inactive Room Types");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Back to Rooms");

		System.out.println();
		System.out.println("Click to Rooms");
		driver.findElement(By.xpath("//span[contains(text(),'Rooms')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Room List')]")).click();
		System.out.println("Click to Room List");

		System.out.println("First link successfully clicked");
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
		System.out.println("Show All Active Rooms");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-md-3']//button[@id='dropdown-size-large']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Inactive Rooms')]")).click();
		System.out.println("Show All Inactive Rooms");
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.navigate().back();

	}

}