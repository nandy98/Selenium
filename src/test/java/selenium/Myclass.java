package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myclass {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();

		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
		driver.quit();
	}

}
