package designPattern2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class IEBrowser extends Browser {

	@Test
	public void getBrowser() {
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/Driver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		
	}

}
