package javaPractice1;

public class DigitsInANumber {

	public static void main(String[] args) {

		int a=1234567;
		int num=0;
		int count =0;
		while(a>0) {
			
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}
