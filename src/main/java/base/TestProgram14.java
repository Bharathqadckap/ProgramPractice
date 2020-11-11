package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProgram14 {
	
	public static void main(String[] args) throws InterruptedException {
		//http://testleaf.herokuapp.com/pages/Window.html
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@onclick='openWin();']")).click();
		Thread.sleep(2000);
		Set<String> winset = driver.getWindowHandles();
		List<String> ls = new ArrayList<String>(winset);
		driver.switchTo().window(ls.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(ls.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
