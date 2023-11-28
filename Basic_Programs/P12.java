package Cdac;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// Write a Java Program to find sum of the digits of a given number.
		
		Scanner SC= new Scanner(System.in);
		System.out.println("Enter the Numbers===>");
		int num=SC.nextInt();
		int sum=0,rem;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum ==>"+sum);

	}

}
