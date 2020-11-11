package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProgram7 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://ezup--dev.cs40.my.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dckap_sfdc@ezup.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("xsVk^E6oa&8n");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
