package Inner_modules;

import org.openqa.selenium.By;

public class G_poss extends F_staffs {
		

public void pos_point() throws InterruptedException {
		
		System.out.println("WellCome to POS");
		driver.findElement(By.xpath("//body/div[@id='root']/div/div/div/div[@class='container App__container__4uEyK']/div/div[6]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'POS Points')]")).click();
		Thread.sleep(2000);
		System.out.println("Show all Active POS Points ");
		
		driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Internet')]")).click();
		System.out.println("Click on Internet ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Micros')]")).click();
		System.out.println("Click on Micros");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//body/div[@id='root']/div/div/div/div[@class='container App__container__4uEyK']/div/div[6]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'POS Items')]")).click();
		System.out.println("Click on POS Items");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='dropdown-size-large']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Test POS Point')]")).click();
		System.out.println("Sho Test POS Points");
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		
	}


}