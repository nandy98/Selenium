package javaPractice1;

public class EvenOrOddArray {

	public static void main(String[] args) {

		int[] num= {1,2,3,4,5,6,7,8,9};
		
		int cOdd = 0;
		int cEven = 0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				cEven++;
				
			}else {
				cOdd++;
			}
		}
		System.out.println("Even no:" + cEven);
		System.out.println("Odd no:" + cOdd);

	}

}
