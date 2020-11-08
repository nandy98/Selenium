package javaPractice1;

public class CountWordsInAString {

	public static void main(String[] args) {

		String s="Java Selenium Maven TestNg Git Jira";
		
		int count=1;
		
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
			count++;
		}
			System.out.println(count);
		}
		System.out.println(count);
		
		
	}

}
