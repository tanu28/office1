package pages;

import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Homepage extends Base {
	
	public Homepage() {
		PageFactory.initElements(driver, this);

	}

}
