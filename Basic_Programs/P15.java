package Cdac;

public class P15 {

	public static void main(String[] args) {
		//  Write a java program to Reverse a given number.
		
		int num=1234;
		int rev=0;
		int rem;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse Number==>"+rev);

	}

}
