package javaPractice1;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
	
		int[] a = {8,7,4,3,9,1,6,2,5,0,9,9,8,7,7,6,5,5,4,3,32,1,0};
		
		int n = a.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}System.out.println(Arrays.toString(a));
	}

}
