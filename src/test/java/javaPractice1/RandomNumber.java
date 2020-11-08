package javaPractice1;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		//1.Approach
		double num = Math.random();
		System.out.println(num);

		//2.Approach
		
		Random rn=new Random(0);
		
		System.out.println(rn.nextInt());
	}

}
