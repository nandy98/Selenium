package prac;

import org.testng.annotations.DataProvider;

public class Datas {
	
	@DataProvider(name="LoginData")
	public Object[][] credentials() {
		return new Object[][] {
			{"anily","Delhi23"},
			{"nandy","koderma12"}};
		
	}

}
