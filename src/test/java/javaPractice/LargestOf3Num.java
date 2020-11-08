package javaPractice;

public class LargestOf3Num {

	public static void main(String[] args) {

		int num1=400;
		int num2=200;
		int num3=600;
		
		if(num1>num2&num1>num3) {
			System.out.println(num1+"is largest");	
		}else if(num2>num3) {
			System.out.println(num2+"is largest");
		}else {
			System.out.println(num3+"is largest");
		}
		
	}

}
