package Cdac;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		// Write a Java Program to print all the Factors of the Given number.

		
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the Number ==> ");
		int  num=SC.nextInt();
		
		System.out.println("Factors of "+ num+" IS==>");
		
		int i=1;
			while(i<=num) {
				if(num%i==0) {
				System.out.print(i+" ");
			
			
				}
				i++;
			}
		
	}

}
