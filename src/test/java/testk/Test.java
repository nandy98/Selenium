package testk;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test {
	
	public static void main(String[] args) throws MalformedURLException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setCapability("browserVersion", "86");
		chromeOptions.setCapability("platformName", "Windows 7");
		WebDriver driver = new RemoteWebDriver(new URL("http://www.example.com"), chromeOptions);
		driver.get("http://www.google.com");
		driver.quit();
	}

}
