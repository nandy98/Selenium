package javaPractice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		/*int arr[]= {1,5,3,4,6,2};
		*/
		int arr[]= {1,0,78,6,6,2,6,0};
		//int arr[]={0,1,2,3,4,5,6,7,8,9,3,4,5,6,4,43,2,7,8,89};
		String a = Arrays.toString(arr);
		
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
	
	}

}
