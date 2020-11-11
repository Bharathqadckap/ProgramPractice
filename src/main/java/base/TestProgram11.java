package base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProgram11 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		 d.get("https://productimizedemostore.myshopify.com/admin");
	  	   d.manage().window().maximize();
	  	   d.findElement(By.id("account_email")).sendKeys("mohammedaneess@dckap.com");
	  	   Thread.sleep(3000);
	  	   d.findElement(By.cssSelector("button.ui-button[type='submit']")).click();
	  	   d.findElement(By.id("account_password")).sendKeys("Productimize@321");
	  	   Thread.sleep(3000);
	  	   d.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/ul/button")).click();
	  	   Thread.sleep(4000);
	  	 WebElement links = d.findElement(By.xpath("//*[@id=\"AppFrameNav\"]/nav/div[2]/ul[1]"));
    	 links.findElement(By.partialLinkText("Apps")).click();
    	 Thread.sleep(5000);
    	 d.findElement(By.xpath("//*[@id=\"gid://shopify/App/3214751\"]")).click();
    	 Thread.sleep(8000);
    	 d.switchTo().frame(d.findElement(By.xpath("//*[@id=\"AppFrameMain\"]/div/div/iframe")));
    	 WebElement MenuOptions = d.findElement(By.xpath("//*[@id=\"root\"]/div/aside/div/nav/ul/li[1]/a/div/i"));
    	 Actions act = new Actions(d);
 		 act.moveToElement(MenuOptions).perform();
 		 Thread.sleep(6000);
 		d.findElement(By.xpath("//*[@id=\"root\"]/div/aside/div/nav/ul/li[2]/a")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/a[1]/span")).click();
		//d.findElement(By.cssSelector("//a[contains(@href,'products add')]")).click();
		Thread.sleep(8000);
		d.findElement(By.id("promize_customizer_name")).sendKeys("Shoe");
		d.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/form/div[1]/div[3]/div[2]/div/button")).click();
		d.findElement(By.id("view_name")).sendKeys("view1");
		WebElement upload = d.findElement(By.cssSelector("div.promize-content-before-upload[title='Upload Image']"));
		//upload.click();
		Thread.sleep(7000);
		d.findElement(By.xpath("//div[@class='promize-upload-content ']")).click();
		Thread.sleep(5000);
		StringSelection value = new StringSelection("C:\\Users\\dckap\\Downloads\\Selenium.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(value, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
	}

}
