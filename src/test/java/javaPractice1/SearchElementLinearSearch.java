package javaPractice1;

public class SearchElementLinearSearch {

	public static void main(String[] args) {

		int[] num= {1,2,3,4,5,6,7,8,9};
		
		int search=8;
		for(int i=0;i<num.length;i++) {
			if(search==num[i]) {
				System.out.println("Element Found" + num[i]);
				break;
			}
			else {
				System.out.println("Element not found");
			}
				
		}
	}

}
