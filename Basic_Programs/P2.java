package Cdac;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// Write a Java Program to find the Factorial of given number.
		Scanner SC= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num =SC.nextInt();
		int fact=1;
		for (int i=1;i<num;i++) {
			fact=fact+fact*i;
		}

		System.out.println("Factorial of "+num+" is "+fact);
	}

}
