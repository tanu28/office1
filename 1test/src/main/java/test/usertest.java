package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
import pages.Loginpage;
import util.Testutil;



public class usertest extends Base {
	Loginpage loginpageobj;
	DashboardPage dashboardobj;
	Testutil utilobj;
	Createuserpage createuserobj;

	String sheetName = "contacts";

	public usertest() {
	super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

	initialization();
	utilobj = new Testutil();
	createuserobj = new Createuserpage();
	loginpageobj = new Loginpage();
	dashboardobj = loginpageobj.login(prop.getProperty("username"), prop.getProperty("password"));
	//TestUtil.runTimeInfo("error", "login successful");
	//testUtil.switchToFrame();
	createuserobj = dashboardobj.clickManageUser();
	}

	@Test(priority =1)
	public void test(){
	createuserobj.clickadduser();
	}
	
	  @DataProvider 
	  public Object[][] getCRMTestData()
	  { 
		  Object data[][] =Testutil.getTestData(sheetName); 
		  return data;
		  }
	  
  
	  @Test(priority=2, dataProvider="getCRMTestData") 
	  public void validateCreateNewuser(String ROLE, String FNAME, String LNAME, String USER,
	  String EMAIL,String COUNTRYCODE, String PHONE, String COOMMETHOD, String ADDRESS, String CITY, String STATE,String ZIPCODE)
	  {
	  //homePage.clickOnNewContactLink(); 
		  dashboardobj.clickManageUser();
	  //contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
	  //contactsPage.createNewContact(title, firstName, lastName, company);
	  createuserobj.clickadduser(); 
	  createuserobj.createNewuser(ROLE, FNAME, LNAME,USER, EMAIL,COUNTRYCODE, PHONE, COOMMETHOD,ADDRESS, CITY, STATE, ZIPCODE);

	  }



	@AfterMethod
	public void tearDown(){
	driver.quit();
	}

}
