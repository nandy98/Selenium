package javaPractice1;

public class Factorial {

	public static void main(String[] args) {

		int num = 10;
		int fact = 1;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}

			System.out.println("Factorial of num:" +num +"="+fact);
		}else if(num==0) {
			System.out.println("Factorial of num=" +num +"is"+"1");
		}

	}

}
