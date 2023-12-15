package Test_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.AbstractParallelWorker.Arguments;

import POM_Classes.Apply_Filter_On_Phone_POM_Class;
import UtilityPackage.ScreenshotUtility;

public class Apply_Filter_On_Phone_Test_Class {
	
	WebDriver driver;
	Apply_Filter_On_Phone_POM_Class filtertestclass;
	ScreenshotUtility screenshot;
	
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\AmazonDummyProject\\src\\main\\resources\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(options);
		screenshot = new ScreenshotUtility();
		filtertestclass=new Apply_Filter_On_Phone_POM_Class(driver);
	}

	//@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	@BeforeMethod
	public void getUrl() {
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	}
	
	//@AfterMethod
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
	
	@SuppressWarnings("deprecation")
	@Test(priority=1)
	public void tc01() throws InterruptedException {
	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		
		filtertestclass.searchfieldmethod("phone");
		
		

	}

}
