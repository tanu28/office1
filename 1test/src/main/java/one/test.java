package one;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import one.pageclass;

public class test extends newbase {
	pageclass loginPage; 
	//HomePage homePage; 
	public test(){
		super();
	}
	
	 @BeforeMethod 
	public void setUp(){
	initialization(); 
	loginPage = new pageclass(); 
	} 
	// @Test(priority=1)
	 //public void loginPageTitleTest()
	 //{ 
	// String title = loginPage.validateLoginPageTitle();
	 // Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software"); // } 
	// // @Test(priority=2) //
	 //public void crmLogoImageTest(){ /
	// boolean flag = loginPage.validateCRMImage(); 
	// Assert.assertTrue(flag); // } 
	@Test(priority=1) 
	public void loginTest()
	{ 
		loginPage.login(prop.getProperty("username1")); 
		}
	 @AfterMethod 
	 public void tearDown(){ 
		 driver.quit(); 
}
}