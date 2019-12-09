package Inner_modules;

import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;

public class D_manageprice extends C_room {
	
	
	// Clicking on Price Manager
		public void pricemanager() throws InterruptedException {
			

			System.out.println("WellCome to Price Manager");
			driver.findElement(By.xpath("//span[contains(text(),'Price Manager')]")).click();
			Thread.sleep(2000);
			System.out.println("Click on Price Manager");
			driver.findElement(By.xpath("//span[contains(text(),'Basic Price')]")).click();
			Thread.sleep(2000);
			System.out.println("Click on Basic Price");
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			Thread.sleep(3000);
			driver.navigate().back();
			System.out.println("yes");

			// Click on Season/vacation
			driver.findElement(By.xpath("//span[contains(text(),'Price Manager')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Seasons/Vacations')]")).click();
			System.out.println("Clicked on Season/vacation");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");

			Thread.sleep(3000);
			driver.navigate().back();
			System.out.println();

			driver.findElement(By.xpath("//span[contains(text(),'Price Manager')]")).click();
			System.out.println("Click on Taxes/Fees");
			driver.findElement(By.xpath("//span[contains(text(),'Taxes/Fees')]")).click();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			System.out.println("Show all Active VAT");
			driver.findElement(By.id("dropdown-size-large")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Inactive VAT')]")).click();
			System.out.println("Show all Inactive VAT");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			driver.findElement(By.xpath("//div[contains(text(),'OTHER TAXES')]")).click();
			Thread.sleep(2000);
			System.out.println("Show All Active Other Taxes");
			driver.findElement(By.xpath("//div//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//button[1]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Inactive Taxes')]")).click();
			System.out.println("Show all Inactive Other Taxes");
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			System.out.println();

			driver.findElement(By.xpath("//span[contains(text(),'Price Manager')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Rate Items')]")).click();
			Thread.sleep(3000);
			System.out.println("Click on Rate Items");
			driver.navigate().back();
			System.out.println();
			
			driver.findElement(By.xpath("//span[contains(text(),'Price Manager')]")).click();
			System.out.println("Click on Rates");
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[5]/span[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body//div[@id='root']//div//div//div//div[@class='container App__container__4uEyK']//div//div[@class='row']//div[4]//div[1]//div[1]//button[1]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Inactive Rates')]")).click();
			System.out.println("Click on Inactive Rates");
			Thread.sleep(2000);
			driver.navigate().back();
			System.out.println();

			// Trying to get text...(Price Adjustment)
			driver.findElement(By.xpath("//span[contains(text(),'Price Manager')]")).click();
			System.out.println("Click and get text on Price Adjustment");
			Thread.sleep(2000);
			String text = driver.findElement(By.xpath("//span[contains(text(),'Price Adjustments')]")).getText();
			// text.getText();
			System.out.println("Copy Text :" + text);
			System.out.println("Click on Price Adjustment");
			driver.findElement(By.xpath("//span[contains(text(),'Price Adjustments')]")).click();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
			Thread.sleep(2000);
			driver.navigate().back();
			System.out.println();

			// Click on Packages
			driver.findElement(By.xpath("//span[contains(text(),'Price Manager')]")).click();
			System.out.println("Click on Packages");
			driver.findElement(By.xpath("//span[contains(text(),'Packages')]")).click();
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
			Thread.sleep(2000);
			driver.navigate().back();
			}
			

}