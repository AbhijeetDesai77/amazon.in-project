package POM_Classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Iphone_Pom_class {
	
	@FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]")private WebElement searchField;
	@FindBy(xpath="(//span[contains(text(),'Apple iPhone 13 (128GB) - Blue')])[1]") private WebElement apple13blue128;
	@FindBy(xpath="(//span[@class=\"a-price-whole\"])[5]")private WebElement priceapple13blue128 ;
	@FindBy(xpath="//input[@id=\"add-to-cart-button\"]") private WebElement AddtoClick;
	
	
	public Search_Iphone_Pom_class(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	@SuppressWarnings("null")
	public void searchFieldmethod(String searchFor) throws InterruptedException {
		searchField.sendKeys(searchFor);

        // Choose iphone from the suggestions
        searchField.sendKeys(Keys.ARROW_DOWN);
        searchField.sendKeys(Keys.ENTER);
        
        apple13blue128.click();
        
        String price = priceapple13blue128.getText();
        
        System.out.println("apple 13 price is := "+price);
        
        


	}
	public void addtocard(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		
		
		AddtoClick.click();
		
	}
	
	
	

}
