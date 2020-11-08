package javaPractice;

public class ReplaceJunk {

	public static void main(String[] args) {
		String removeJunk="@@@@@HEloo@@@@(*";
		
		String a = removeJunk.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(a);
		String b="hello     babu    hey    selenium";
		
		String c = b.replaceAll("\\s", "");
		System.out.println(c);
	}
	

}
