package base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProgram10 {

	public static void main(String[] args) throws InterruptedException, AWTException {
	method1();
	//method2();
	}
	
	public static void method1() throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.iedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-extensions");
        options.addArguments("--auto-open-devtools-for-tabs");
		WebDriver driver = new ChromeDriver(options);
//		//driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
//		FirefoxOptions options = new FirefoxOptions();
//        options.addArguments("start-maximized");
//        options.addArguments("--disable-extensions");
//        options.addArguments("--devtools");
//        WebDriver driver = new FirefoxDriver(options);
//		InternetExplorerOptions options = new InternetExplorerOptions();
//		options.addCommandSwitches("-k");
//		InternetExplorerDriver driver = new InternetExplorerDriver(options);
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		//Actions act = new Actions(driver);
		//act.sendKeys(Keys.F12).build().perform();
		
		driver.get("https://jqueryui.com/droppable/");
		//driver1.get("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//Actions act = new Actions(driver);
		//act.sendKeys(Keys.chord(Keys.SHIFT + Keys.CONTROL + "s")
			
//		   Thread.sleep(5000);
//
//		   // Release SHIFT+CTRL keys   
//		   act.keyUp(Keys.CONTROL)
//		    .keyUp(Keys.SHIFT)
//		    .build()
//		    .perform();
	}
	
	public static void method2() throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_F12);

	}

}
