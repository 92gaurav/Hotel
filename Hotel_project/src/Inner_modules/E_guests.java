package Inner_modules;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

public class E_guests extends D_manageprice {

	       
	        // Now This is Guest Section...
		    public void guests() throws InterruptedException {
			System.out.println("WellCome to Guests");
			driver.findElement(By.xpath("//span[contains(text(),'Guests')]")).click();
			System.out.println("Click to Guests");
			driver.findElement(By.xpath("//span[contains(text(),'Salutations')]")).click();
			System.out.println("Click to Salution");
			Thread.sleep(2000);
			System.out.println("Show all Active Salution");
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
			driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Inactive Salutations')]")).click();
			System.out.println("Shows Inactive Salution");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
			driver.navigate().back();

			driver.findElement(By.xpath("//body/div[@id='root']/div/div/div/div[@class='container App__container__4uEyK']/div/div[4]/div[1]/div[1]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Guest tags')]")).click();
			Thread.sleep(2000);
			System.out.println("Show all Active Guests Tags");
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
			driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Inactive Guest tags')]")).click();
			System.out.println("Show all Inactive Guest Tags");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			((JavascriptExecutor) driver).executeScript("scroll(document.body.scrollHeight,0)");
			driver.navigate().back();

			driver.findElement(By.xpath(
					"//body/div[@id='root']/div/div/div/div[@class='container App__container__4uEyK']/div/div[4]/div[1]/div[1]"))
					.click();
			driver.findElement(By.xpath("//span[contains(text(),'Reservation tags')]")).click();
			Thread.sleep(2000);
			System.out.println("Show all Active Reservation Tags ");
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
			driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Inactive Reservation tags')]")).click();
			System.out.println("Show all Inactive Reservation Tags");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
			driver.navigate().back();

			driver.findElement(By.xpath("//body/div[@id='root']/div/div/div/div[@class='container App__container__4uEyK']/div/div[4]/div[1]/div[1]")).click();
			String text = driver.findElement(By.xpath("//span[contains(text(),'Origin types')]")).getText();

			System.out.println("Copy Text is :" + text);
			System.out.println();
			if (text.equalsIgnoreCase("Origin types")) {
				System.out.println("Text is Matching");
			} else {
				System.out.println("Text is not Matching");
			}
			driver.findElement(By.xpath("//span[contains(text(),'Origin types')]")).click();
			System.out.println();
			System.out.println("Show all Active Origin Types");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
			driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Inactive Origin types')]")).click();
			System.out.println("Shows all Inactive Origin Types");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
			driver.navigate().back();

			driver.findElement(By.xpath(
					"//body/div[@id='root']/div/div/div/div[@class='container App__container__4uEyK']/div/div[4]/div[1]/div[1]"))
					.click();
			driver.findElement(By.xpath("//span[contains(text(),'Identification types')]")).click();
			System.out.println("Click to Identification Type");
			Thread.sleep(2000);
			System.out.println("Show all Active Identification Types");
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
			driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Inactive Identification types')]")).click();
			System.out.println("Show all Inactive Identification Type");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
			driver.navigate().back();

			driver.findElement(By.xpath(
					"//body/div[@id='root']/div/div/div/div[@class='container App__container__4uEyK']/div/div[4]/div[1]/div[1]"))
					.click();
			driver.findElement(By.xpath("//span[contains(text(),'Relations')]")).click();
			System.out.println("Click to Relation");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
			System.out.println("Show all Active Relation");
			driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Inactive Relations')]")).click();
			System.out.println("Show all Inactive Relation");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
			((JavascriptExecutor) driver).executeScript("scroll(0,-document.body.scrollHeight)");
			driver.navigate().back();

		}


}