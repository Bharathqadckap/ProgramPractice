package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThreadCreation implements Runnable{

	String name,browser;
	String num;
	Thread t;



	ThreadCreation (String thread,String browser1,String i)
	{
		name = thread; 
		browser=browser1;
		num=i;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}   


	public void run ()

	{

		WebDriver driver;
		if(this.browser.equalsIgnoreCase("chrome"))
		{

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--disable-extensions");
			options.addArguments("--auto-open-devtools-for-tabs");
			driver=new ChromeDriver(options);    	 		
			driver.get(this.name);




		} else if (this.browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("start-maximized");
			options.addArguments("--devtools");
			driver=new FirefoxDriver(options);    	 		
			driver.get(this.name);
		} else
		{
			WebDriverManager.iedriver().setup();
			InternetExplorerDriver driver1 = new InternetExplorerDriver();
			Actions act = new Actions(driver1);
			act.sendKeys(Keys.F12).build().perform();
			driver1.get(this.name);

		}
	}

}
