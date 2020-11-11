package test;

import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestClass {
	
	public ExtentReports extent;
	
	public ExtentTest logger;

	
	@BeforeSuite
	public void beforeSuite() {
		ExtentHtmlReporter report = new ExtentHtmlReporter(new File("./Reports/test.html"));
		extent = new ExtentReports();
		extent.attachReporter(report);
	}
	
	
	@AfterMethod
	public void aftermethod(ITestResult result) {
		
		if(result.getStatus() == ITestResult.SUCCESS) {
			logger.pass("This is pass");
		}
		
		else if(result.getStatus() == ITestResult.FAILURE) {
			logger.fail("This is fail");
		}
		
		else if(result.getStatus() == ITestResult.SKIP) {
			logger.skip("This is skip");
		}
		
	}
	
}
