package Cdac;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		// Write a Java Program to print the digits of a Given Number.
		
		Scanner SC =new Scanner (System.in);
		System.out.println("Enter the Numbers");
		int num=SC.nextInt();
		System.out.println("Digits===>");
		int digit;
	  int  rev=0;
	  
	  //Method 1
//		while(num>0) {
//			digit=num%10;
//			System.out.print(digit+" , ");
//			num=num/10;
//		}
	  
	  
	  
	  
	  //Method 2 (Using Reverse)
		while(num>0) {
			digit=num%10;
			rev=rev*10+digit;
			
			num=num/10;
		}
		//System.out.println(rev+ " ");
		while(rev>0) {
			digit=rev%10;
			System.out.print(digit+" , ");
			rev=rev/10;
		}
	}

}
