package javaPractice;

public class FactorialOfNum {

	public static int factorialNumber(int num) {
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {

		System.out.println(factorialNumber(10));
		
		
		
	}

}
