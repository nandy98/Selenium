package javaPractice1;

import java.util.Arrays;

public class TwoArraysEqual {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5};
		
		//1.Approach
		/*boolean status = Arrays.equals(a, b);
		
		if(status==true) {
			System.out.println("Arrays Equal");
		}
		else {
			System.out.println("Arrays Not Equal");}*/

		//2.Approach
		boolean status = true;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				status=false;
			}
			
		}
		if(status==true) {
			System.out.println("Arrays Equal");
		}else {
			System.out.println("Arrays not Equal");
		}
	}

}
