package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;
import test.DashboardPage;

public class Loginpage extends Base {

//WebDriver driver;
    
    @FindBy (id= "EmailAddress") 
    WebElement username;

    @FindBy (id= "Password") 
    WebElement password;

    @FindBy (xpath= "//h2[contains(text(),'Medical Portal Login')]") 
    WebElement loginpagetitle;

    @FindBy (id= "btnSubmitValidate") 
    WebElement loginbutton;

    @FindBy (xpath= "/html/body/div/div/img") 
    WebElement logo;
   
  //intialize page object

   
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
//Actions
	
	public String verifylogintitle() {
		return driver.getTitle();
		
	}
	
	public boolean verifylogo() {
		return logo.isDisplayed();
		}
	
	
	/*public void logintest1 (String UN, String PSD) {
		username.sendKeys(UN);  
		password.sendKeys(PSD);
		loginbutton.click();
		// JavascriptExecutor js = (JavascriptExecutor)driver; 
		 //js.executeScript("arguments[0].click();", loginbutton);
	}
	*/
	
    //login 
	
   public DashboardPage login(String UN, String PSD) {
	username.sendKeys(UN);  
	password.sendKeys(PSD);
	loginbutton.click();
	return new DashboardPage();
	}  
}
