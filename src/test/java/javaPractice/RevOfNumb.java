package javaPractice;

public class RevOfNumb {

	public static void main(String[] args) {

		int num = 12345;
		
		/*int rev = 0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		*/
		
		//2.Method
		String numst = String.valueOf(num);
		StringBuffer sb = new StringBuffer(numst);
		System.out.println(sb.reverse());
	}

}
