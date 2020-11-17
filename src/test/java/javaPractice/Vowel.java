package javaPractice;

public class Vowel {

	public static void main(String[] args) {

		String salary ="be happy with your salary";
		char a='a';
		char e='e';
		char vi='i';
		char o='o';
		char u='u';
		
		int count = 0;
		for(int i=0;i<salary.length();i++) {
			if(a==(salary.charAt(i))|e==(salary.charAt(i))|vi==(salary.charAt(i))|o==(salary.charAt(i))|u==(salary.charAt(i))) {
				
				System.out.println(salary.charAt(i));
				count++;
			}
		}
		System.out.println(count);
		

	}

}
