package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void beforem() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		driver = new ChromeDriver();	
	}

}
