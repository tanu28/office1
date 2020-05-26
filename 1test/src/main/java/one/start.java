package one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome webdriver latest\\chromedriver for version 80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait mywait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		driver.manage().window().maximize();
		
		String url = "http://202.164.57.203:8101/";
		driver.get(url);
	}

}
