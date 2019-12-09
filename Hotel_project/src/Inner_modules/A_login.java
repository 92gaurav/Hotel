package Inner_modules;

import java.io.IOException;


import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class A_login {

	static WebDriver driver;
	

	public void pagelogin() throws InterruptedException, MalformedURLException, IOException {
	

		String link="http://127.0.0.1:8000/login";
		String user="onclick.hemant@gmail.com";
		String pass="pass123";
		
		System.out.println("Login Started");
		System.setProperty("webdriver.gecko.driver", "/usr/games/geckodriver");
		driver = new FirefoxDriver();
		driver.get(link);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		System.out.println("Start");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[3]/div/div/form/div/div[3]/div/input")).click();
		System.out.println("WellCome to Hotel California");
		System.out.println();
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("h").build().perform();
		Thread.sleep(2000);
		
		
		//Shows link status and list of link on the Web page
		
		List<WebElement> web = driver.findElements(By.tagName("a"));
		System.out.println("There are "+ web.size() +" links");

		for(int i=1;i<web.size();i++) {
			System.out.println(web.get(i).getText());
			WebElement ele=web.get(i);
			String url = ele.getAttribute("href");
			
			urlresponse(url);
		}
		
	}
	
	public void urlresponse(String urlLink) {
		// TODO Auto-generated method stub
		
		try {
			 //Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
			 URL link = new URL(urlLink);
			 
			 System.out.println("Url Link : "+urlLink);
			 // Create a connection using URL object (i.e., link)
			 HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
			 //Set the timeout for 2 seconds
			 httpConn.setConnectTimeout(2000);
			 //connect using connect method
			 httpConn.connect();
			 //use getResponseCode() to get the response code. 
			 if(httpConn.getResponseCode()== 200) { 
			 System.out.println(urlLink+" -- "+httpConn.getResponseMessage());
			 }
			 if(httpConn.getResponseCode()== 404) {
			 System.out.println(urlLink+" ---- "+httpConn.getResponseMessage());
			 }
			 }
			 //getResponseCode method returns = IOException - if an error occurred connecting to the server. 
			 catch (Exception e) {
			 						}
											}
	}


	/*public void  home_page() throws InterruptedException {
		
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
		
		
	}*/
	
	/*public void setting_dropdown() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[text()='hotel admin']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Change Password')]")).click();
		System.out.println("Click to Change Password");
		
		
		System.out.println("Move to PopUp");
		//Get Popup Message
		//driver.switchTo().alert().getText();			
		//System.out.println();
		//Switch to Popup
		
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
		System.out.println("Rechecked Language and Select to English");
		
	}*/

	/*public void property() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Click to Property");
		// Click to Property
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
		// Now clicking the Property information in Property
		System.out.println("Click to Property information");
		driver.findElement(By.xpath("//span[contains(text(),'Property Information')]")).click();
		((JavascriptExecutor)driver).executeScript("scroll(0,document.body.scrollHeight)");
		System.out.println("First link Successfull clicked");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'DESCRIPTION')]")).click();
		System.out.println("Second link Successfully clicked");
		((JavascriptExecutor)driver).executeScript("scroll(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'IMAGES')]")).click();
		System.out.println("Third link Successfull clicked");
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		Thread.sleep(2000);	
		driver.navigate().back();
		System.out.println("Back to Property");
		Thread.sleep(3000);

		// Now Clicking the default settings in Property
		System.out.println();
		System.out.println("Click to Default Settings");

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Default Settings')]")).click();
		System.out.println("First link successfully clicked");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//div[contains(text(),'CHECK IN / OUT')]")).click();
		System.out.println("Second link successfully clicked");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//div[contains(text(),'HOUSE KEEPING SETTINGS')]")).click();
		System.out.println("Third  link successfully clicked");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//div[contains(text(),'GUEST CATEGORIES')]")).click();
		System.out.println("Fourth link succesfully clicked");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		driver.navigate().back();
		System.out.println("Back to property");
		Thread.sleep(3000);

		// Now clicking the Accounting in Property
		System.out.println();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
		System.out.println("Click to Accounting");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		System.out.println("Show All Active Ledger Cattegory");
		driver.findElement(By.xpath("//div[@class='Ledgers__textRight__3ruhe col-md-6']//div//button[@id='dropdown-size-large']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Inactive Ledger Category')]")).click();
		Thread.sleep(2000);
		System.out.println("Show all Inactive Ledger category");
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//div[@class='panel-title'][contains(text(),'LEDGERS')]")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		System.out.println("Show All Active Ledger");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='Ledgers__textRight__3ruhe col-md-8']//div[@class='pull-right btn-toolbar']//button[@id='dropdown-size-large']")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//span[contains(text(),'Inactive Ledgers')]")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		System.out.println("Show All Inactive Ledger");
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println();
		System.out.println("Property section is complete");

	}*/

	/*public void room() throws InterruptedException {

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

	}*/

	/*// Clicking on Price Manager
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
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		System.out.println("Show all Active VAT");
		driver.findElement(By.id("dropdown-size-large")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Inactive VAT')]")).click();
		System.out.println("Show all Inactive VAT");
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'OTHER TAXES')]")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
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
		System.out.println("Click on Rate Items");
		driver.findElement(By.xpath("//span[contains(text(),'Rate Items')]")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println();

		driver.findElement(By.xpath("//span[contains(text(),'Price Manager')]")).click();
		System.out.println("Click on Rates");
		driver.findElement(By.xpath("//span[contains(text(),'Rates')]")).click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,document.body.scrollHeight)");

		driver.findElement(By.xpath(
				"//body//div[@id='root']//div//div//div//div[@class='container App__container__4uEyK']//div//div[@class='row']//div[4]//div[1]//div[1]//button[1]"))
				.click();
		System.out.println("Click on Inactive Rates");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Inactive Rates')]")).click();
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

	}*/

	// Now This is Guest Section...
	/*public void guests() throws InterruptedException {
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

	}*/
	
	/*public void staff() throws InterruptedException {
		
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
		
	}*/
	
	/*public void pos_point() throws InterruptedException {
		
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
		
		
		
	}*/
	/*public void template_designer() throws InterruptedException {
		
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
	    Thread.sleep(2000);
	    System.out.println("Its Time to LogOut");
	    driver.findElement(By.xpath("//span[@class='fa fa-power-off']")).click();
	    driver.close();

	}
*/
	/*public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Login qa = new Login();
		qa.loginpage();
		qa.home_page();
		qa.setting_dropdown();
		qa.property();
		qa.room();
		qa.pricemanager();
		qa.guests();
		qa.staff();
		qa.template_designer();

	}

}*/