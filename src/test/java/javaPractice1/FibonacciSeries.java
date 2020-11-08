package javaPractice1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int sum;
		
		System.out.print("0"+","+"1"+",");
		for(int i=1;i<=10;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(sum+",");
		}

	}

}
