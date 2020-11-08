package javaPractice;

public class PlindromeString {

	public static void main(String[] args) {

		String pName = "abcdcba";

		String rev ="";
		//1.Logic
		/*StringBuffer sb = new StringBuffer(pName);
		StringBuffer rev = sb.reverse();
		String reverse = rev.toString();

		if (pName.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not Palindrome String");
		}*/

		//2.Logic
		for(int i=pName.length()-1;i>=0;i--) {
			rev = rev + pName.charAt(i);
		}
		if(rev.equals(pName)) {
			System.out.println("Palindrome String");
	} else {
		System.out.println("Not Palindrome String");
	}
		
	}

}
