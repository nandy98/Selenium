package javaPractice;

public class SearchElementArray {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50};
		int search_elm=30;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search_elm) {
				System.out.println(arr[i]);
			}
		}
	}

}
