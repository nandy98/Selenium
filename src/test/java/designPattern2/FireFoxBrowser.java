package designPattern2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxBrowser extends Browser{

	@Test
	public void getBrowser() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	}

}