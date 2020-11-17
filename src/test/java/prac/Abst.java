package prac;

public abstract class Abst {
	
	int a;
	int b=20;
	
	public int sum(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	abstract public void sub(int a, int b);
}
