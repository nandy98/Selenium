package javaPractice;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		int num1 = 12321;
		int rev = 0;
		
		int num=num1;
		while(num1!=0) {
			rev=rev*10+num1%10;
			num1=num1/10;
		}
		System.out.println(rev);
		
		if(num==rev) {
			System.out.println("Palindrome NUmber");
		}else {
			System.out.println("Not Palindrome NUmber");
		}
	}

}
