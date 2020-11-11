package base;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestProgram6 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bharathm@dckap.com");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bharath@007");
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Search mail']")).sendKeys("Forgot your Cloras Password?");
		act.sendKeys(Keys.ENTER).build().perform();
		//driver.findElement(By.xpath("(//span[@email='info@cloras.com'])[1]")).click();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("(//table[@role='grid'])[3]"))).click().perform();
		Thread.sleep(3000);
		String attribute = driver.findElement(By.xpath("(//div[@align='center'])[3]/div/div/div/a")).getAttribute("href");
		System.out.println(attribute);
		driver.get(attribute);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Dckap@1234");
		driver.findElement(By.xpath("//input[@name='cpassword']")).sendKeys("Dckap@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.getTitle());
		
	}
}
