package designPattern2;

public class BrowserFactory {
	
	public Browser getBrowserName(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			return new ChromeBrowser();
		}
		if(browserName.equalsIgnoreCase("firefox")) {
			return new FireFoxBrowser();
		}
		if(browserName.equalsIgnoreCase("IE")) {
			return new IEBrowser();
		}
		return new ChromeBrowser();
	}

}
