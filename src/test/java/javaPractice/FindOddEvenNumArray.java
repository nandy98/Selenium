package javaPractice;

public class FindOddEvenNumArray {

	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,23};
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
			if(a[i]%2==0) {
				System.out.println("Even Number"+a[i]);
			}else {
				System.out.println("Odd NUmber" +a[i]);
			}
		}
		
	}

}
