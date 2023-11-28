package Cdac;

public class P14 {

	public static void main(String[] args) {
		// How to add two numbers without using the arithmetic operators in Java?
		
		int a=100;
		int b=200;
		
		int res=sum(a,b);
		System.out.println("Result="+res);

	}
	
	public static int sum(int a,int b) {
		while(b!=0) {
			int c= a&b;
		//	System.out.println(c);
		a=a^b;
		//System.out.println(a);
		
		b=c<<1;
		//System.out.println(b);
		}
		return a;
		
	}

}
