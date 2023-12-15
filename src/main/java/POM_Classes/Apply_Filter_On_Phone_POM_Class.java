package POM_Classes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Apply_Filter_On_Phone_POM_Class {
	
	
	@FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]")private WebElement serchField;
	@FindBy(xpath="//input[@id=\"nav-search-submit-button\"]") private WebElement searchBtn;
	@FindBy(xpath="(//input[@type=\"checkbox\"])[13]")private WebElement Android10;
	@FindBy(xpath="(//input[@type=\"checkbox\"])[6]")private WebElement PhoneBrand;
	@FindBy(xpath="(//input[@type=\"checkbox\"])[3]")private WebElement Delivery;
	
	
	public Apply_Filter_On_Phone_POM_Class(WebDriver driver){
		PageFactory.initElements(driver, this);	
	}
	
	public void searchfieldmethod(String input) {
		serchField.sendKeys(input);
		
		searchBtn.click();
		
		Android10.click();
		
		
		PhoneBrand.click();
		
		Delivery.click();

	}
	
	
	

}
