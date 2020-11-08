package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXPath {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		
		
		driver.findElement(By.xpath("//input[starts-with(@type,'text')]")).sendKeys("hello");
		driver.quit();
	}

}
