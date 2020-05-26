package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class Createuserpage extends Base{
	@FindBy(xpath = "//*[@id=\"Divfilter\"]/div[3]/a[1]")
	WebElement adduser;


	@FindBy(id="FirstName")
	WebElement firstName;

	@FindBy(id="LastName")
	WebElement lastName;

	@FindBy(name="Username")
	WebElement username;


	@FindBy(name="EmailAddress")
	WebElement emailaddress;

	@FindBy(name="PhoneNumber")
	WebElement phonenumber;

	@FindBy(name="Addresses_0__Address_Street1")
	WebElement address1;

	@FindBy(name="Addresses_0__Address_City")
	WebElement City;

	@FindBy(name="Addresses_0__Address_Zip")
	WebElement zipcode;

	@FindBy(xpath = "btnsubmitvalidate")
	WebElement saveBtn;



	// Initializing the Page Objects:
	public Createuserpage() {
	PageFactory.initElements(driver, this);
	}


	public void clickadduser(){
	adduser.click();
	}

	public void createNewuser(String RoleName, String ftName, String ltName, String UsName, String EmailId, String CountryCode, String PhoneNo,
			String CommMetohod, String Address, String cityname, String State,  String zip) {
		// TODO Auto-generated method stub
		Select Role = new Select(driver.findElement(By.id("RoleId")));
		Role.selectByVisibleText(RoleName);


		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		username.sendKeys(UsName);
		emailaddress.sendKeys(EmailId);

		Select countrycode = new Select(driver.findElement(By.id("CountryID")));
		Role.selectByVisibleText(CountryCode);

		phonenumber.sendKeys(PhoneNo);

		Select communicationmethod = new Select(driver.findElement(By.id("PreferredCommMethodID")));
		Role.selectByVisibleText(CommMetohod);

		address1.sendKeys(Address);
		City.sendKeys(cityname);

		Select state = new Select(driver.findElement(By.id("Addresses_0__Address_StateID")));
		Role.selectByVisibleText(State);

		zipcode.sendKeys(zip);

		saveBtn.click();
	}

}
