package javaPractice;

import java.util.Arrays;

public class TwoArrayEquals {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		
		boolean status = Arrays.equals(a, b);
		
		if(status==true) {
			System.out.println("equals");
		}else{
			System.out.println("not equals");
		}
	}

}
