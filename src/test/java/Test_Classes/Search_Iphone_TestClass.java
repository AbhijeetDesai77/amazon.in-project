package Test_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Classes.Search_Iphone_Pom_class;
import UtilityPackage.ScreenshotUtility;


public class Search_Iphone_TestClass {
	
	WebDriver driver;
	Search_Iphone_Pom_class search_iphone_pom_class;
	ScreenshotUtility screenshot;
	
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\AmazonDummyProject\\src\\main\\resources\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(options);
		screenshot = new ScreenshotUtility();
		search_iphone_pom_class =new Search_Iphone_Pom_class(driver);
	}
	@AfterClass
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
	
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		
		search_iphone_pom_class.searchFieldmethod("iphone");
		

	}
	

}
