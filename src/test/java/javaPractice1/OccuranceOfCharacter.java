package javaPractice1;

public class OccuranceOfCharacter {

	public static void main(String[] args) {

		String s="Hello Nandlal";
		int tcount = s.length();
		
		String sr = s.replaceAll("a", "");
		int count = sr.length();
		
		int ncount = tcount-count;
		System.out.println(ncount);
		
		
		
		

	}

}
