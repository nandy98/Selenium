package javaPractice;

public class SumOfElementsArray {

	
	
	public static void main(String[] args) {

		int[] arr = {10,20,30,40};
		
		int a = arr.length;
		System.out.println(a);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
		
	}

}
