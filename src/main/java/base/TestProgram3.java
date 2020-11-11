package base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestProgram3 {
	

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/input.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheet("Sheet2");
		//FileOutputStream fos = new FileOutputStream("./data/input.xlsx");
		FileOutputStream fos = new FileOutputStream("./data/input.xlsx");
		for (int i = 1; i < 3; i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(0);
			String sourceURL = cell.getStringCellValue();
			System.out.println(sourceURL);
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(sourceURL);
			String text = driver.findElement(By.xpath("(//label[@class='checkbox checkout-label'])[1]")).getText();
			System.out.println(text);
			XSSFCell cell3 = row.getCell(2);
			String message = cell3.getStringCellValue();
			System.out.println(message);
			System.out.println(text.equals(message));
			boolean outputValue = text.equals(message);
			if(outputValue==true) {
				sheet.getRow(i).createCell(3).setCellValue("true");
			}
			else {
				sheet.getRow(i).createCell(3).setCellValue("false");
			}
			//sheet.getRow(i).createCell(3).setCellValue(outputValue);
			wbook.write(fos);
			driver.close();
			
		}
		fos.close();
		wbook.close();
	}
	
}
