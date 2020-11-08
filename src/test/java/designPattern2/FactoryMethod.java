package designPattern2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryMethod {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String browserName = br.readLine();
		
		BrowserFactory bf = new BrowserFactory();
		Browser name = bf.getBrowserName(browserName);
		name.getBrowser();
		
	
	}

}
