package one;
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory; 

public class pageclass extends newbase {
// @FindBy(name="EmailAddress") WebElement username;
 @FindBy (id = "EmailAddress") WebElement username;
 @FindBy(name="btnK") WebElement search;
 
 
 public pageclass()
 { 
	 PageFactory.initElements(driver, this);
	 } 
 public String validateLoginPageTitle()
 { return driver.getTitle(); 
 } 
 public void login(String un)
 { 
	 username.sendKeys(un); 
 //loginBtn.click(); 
 JavascriptExecutor js = (JavascriptExecutor)driver; 
 js.executeScript("arguments[0].click();", search);
 //return new HomePage(); } }
 }
 }