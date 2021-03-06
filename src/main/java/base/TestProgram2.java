package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TestProgram2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://cloras.ezup.com/customer/account/login/referer/aHR0cHM6Ly9jbG9yYXMuZXp1cC5jb20vY2hlY2tvdXQv/");
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("rachelgreen@mail.com");
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("Dckap@123");
		//driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("testnewthirty@mailinator.com");
		//driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(10000);
		//driver.get("https://cloras.ezup.com/speed-shelterr.html");
		driver.get("https://cloras.ezup.com/sierra-tan.html");
//		Select sel = new Select(driver.findElement(By.name("options_8676[2461]")));
//		sel.selectByIndex(3);
//		Select sel1 = new Select(driver.findElement(By.name("options_228088[2438]")));
//		sel1.selectByIndex(1);
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//button[@data-role='proceed-to-checkout']")).click();
		driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']/span")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		driver.findElement(By.xpath("(//span[@data-bind='text: element.shippingMethodResult(method.shipping_method)'])[2]")).click();
		Thread.sleep(10000);
		WebElement findElement = driver.findElement(By.xpath("//button[@class='button action continue primary']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", findElement);
		Thread.sleep(25000);
		driver.findElement(By.xpath("(//div[@class='payment-method-title field choice'])[2]/input")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//button[@title='Place Order'])[2]")).click();
		Thread.sleep(10000);
		String ordernumber = driver.findElement(By.xpath("//a[@class='order-number']/strong")).getText();
		System.out.println(ordernumber);
		driver.get("https://cloras.ezup.com/ezoriginal/admin/index");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Dckap");
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("Zxcv!2345");
		driver.findElement(By.xpath("//button[@class='action-login action-primary']")).click();
		driver.findElement(By.xpath("//span[text()='Sales']//parent::a")).click();
		driver.findElement(By.xpath("//span[text()='Orders']//parent::a")).click();
		driver.findElement(By.xpath("//input[@class='admin__control-text data-grid-search-control']")).clear();
		driver.findElement(By.xpath("//input[@class='admin__control-text data-grid-search-control']")).sendKeys(ordernumber);
		Thread.sleep(10000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='View']"))));
		driver.findElement(By.xpath("//a[text()='View']")).click();
		String currentUrl = driver.getCurrentUrl();
		String[] split = currentUrl.split("/");
		String entity_id = split[8];
		driver.get("https://v3.cloras.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bharathm@dckap.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Dckap@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//img[@alt='Switch Accounts']")).click();
		driver.findElement(By.xpath("//div[text()='Girinath  A']")).click();
		driver.findElement(By.xpath("//button[text()='Switch']")).click();
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text()='Manage']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Order Flow']//following::a[2]")).click();
		Thread.sleep(10000);
		String syncmessage = driver.findElement(By.xpath("(//div[@class='job-status-success']/span)[1]")).getText();
		System.out.println(syncmessage);
		Assert.assertEquals(syncmessage, "Synchronized");
		driver.get("https://ezup--dev.cs40.my.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dckap_sfdc@ezup.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("xsVk^E6oa&8n");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@id='phSearchInput']")).sendKeys(entity_id);
		driver.findElement(By.xpath("//div[@id='searchButtonContainer']")).click();
		Thread.sleep(10000);
		String opportunity = driver.findElement(By.xpath("//span[@class='searchFirstCell']")).getText();
		System.out.println(opportunity);
		Assert.assertEquals(opportunity, "Opportunities (1)");
		System.out.println("Completed");
		Thread.sleep(10000);
		driver.close();	
	}

}
