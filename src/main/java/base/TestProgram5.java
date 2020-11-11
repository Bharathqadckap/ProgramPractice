package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestProgram5 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://cloras.ezup.com/customer/account/create/");
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("New");
		driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys("909880890980");
		driver.findElement(By.xpath("//input[@id='street_1']")).sendKeys("101 Manning st");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Los Angeles");
		Thread.sleep(15000);
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='region_id']")));
		sel.selectByIndex(12);
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("90001");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("testnewtwentynine@mailinator.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Test@1234");
		
		
	}

}
