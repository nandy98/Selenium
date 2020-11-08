package javaPractice;

public class CountOddEvenInNumber {
	
	public static void main(String[] args) {
		
		int num=234679;
		
		int odd=0;
		int even=0;
		
		while(num>0) {
			int rem = num%10;
			num=num/10;
			if(rem%2==0) {
				even++;
			}else
			{
			odd++;	
			}
			
			
		}
		System.out.println("Even count:"+ even);
		System.out.println("Odd count:"+ odd);
		
	}

}
