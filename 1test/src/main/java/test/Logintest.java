package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import pages.Homepage;
import pages.Loginpage;

public class Logintest extends Base {
	Loginpage objlogin;
	DashboardPage dashboardobj;	
	
	public Logintest() {
	super();	
	}
	@BeforeTest
	
	public void setup() {
		initialization();
		objlogin = new Loginpage();
	}
	
	@Test
	public void test_homepage_appear(){
		dashboardobj = objlogin.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
			public void tearDown(){
		driver.quit();
}
}