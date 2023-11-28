package Cdac;

public class P5 {

	public static void main(String[] args) {
		// . Swap two numbers without using third variable approach 2. 
		int A=10;
		int B=20;
		System.out.println("Before SWAP==>");
		System.out.println("A="+A);
		System.out.println("B="+B);
		
		A=A*B;
		B=A/B;
		A=A/B;
		System.out.println("After SWAP==>");
		System.out.println("A="+A);
		System.out.println("B="+B);
		
	}

}
