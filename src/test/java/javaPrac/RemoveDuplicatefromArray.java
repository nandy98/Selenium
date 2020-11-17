package javaPrac;

import java.util.Arrays;

public class RemoveDuplicatefromArray {

	public static void main(String[] args) {
	
		int [] arr = {10,20,30,40,50,30};
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		String a1 = Arrays.toString(arr);
		//System.out.println(a1);
		
		int temp[]=new int [arr.length];
		
		int j =0;
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
			
		}
		temp[j]=arr[arr.length-1];
		System.out.println(Arrays.toString(temp));
		
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
	}

}
