package selenium;

public class Test {

	public static void main(String[] args) {
	/*	int n1=0;
		int n2=1;
		int sum=1;
		System.out.println(("0"+" "+"1"));
		for(int i =1;i<=10;i++){
		sum=n1+n2;
		n1=n2;
		n2=sum;
		System.out.println((sum));
		}*/
		
		String s = "@@@@Hello12345defgh";
		//	System.out.println(s.replaceAll("[^0 9]", " "));
		String a = s.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(a);

	}

}
