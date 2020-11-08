package designPattern2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OperaBrowser extends Browser {

	@Override
	public void getBrowser() {
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/Driver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
	}
	
	

}
