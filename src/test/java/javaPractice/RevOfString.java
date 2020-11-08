package javaPractice;

public class RevOfString {

	public static void main(String[] args) {

		String name="Nandlal";
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse());
	}

}
