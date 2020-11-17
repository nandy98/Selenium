package singletonPattern;

public class Test {

	public static void main(String[] args) {

		
		SingleObject obj = SingleObject.getInstance();
		SingleObject obj2 = SingleObject.getInstance();
	     
	      obj.showMessage();
	      obj2.showMessage();
	   }
}
