package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProgram8 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://v3.cloras.com/");
		driver.findElement(By.name("username")).sendKeys("bharathm@dckap.com");
		driver.findElement(By.name("password")).sendKeys("Dckap@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Manage']")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//img[@alt='Advanced']"))).build().perform();
		driver.findElement(By.xpath("//img[@alt='Flows']")).click();
		driver.findElement(By.xpath("//a[text()='Add new']")).click();
		WebElement source = driver.findElement(By.xpath("(//div[@class='f-handler'])[1]"));
		WebElement target = driver.findElement(By.xpath("//div[@class='fw-drop-here']"));
		Thread.sleep(6000);
		act.dragAndDrop(source, target).build().perform();
		Thread.sleep(5000);
		driver.close();
		
	}

}
