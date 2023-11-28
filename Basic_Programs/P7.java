package Cdac;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// How to check the given number is Positive or Negative in Java

		
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=SC.nextInt();
		if(n==0) {
			System.out.println(n +" is a Zero");
		}
		else if(n>0) {
			System.out.println(n+ " Is a Positive Number");
		}
		else {
			System.out.println(n+ " IS a Negative Number");
		}
	}

}
