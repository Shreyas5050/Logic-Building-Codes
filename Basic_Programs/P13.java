package Cdac;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		//  Write a Java Program to find the smallest of 3 numbers(a,b,c) without using < or > symbol?
    Scanner SC=  new Scanner(System.in);
    System.out.println("Enter the First Number==");
    int a =SC.nextInt();
    System.out.println("Enter the Second Number==");
    int b=SC.nextInt();
    System.out.println("Enter the third Number==");
    int c=SC.nextInt();
    
    int res=Smallest(a,b,c);
    System.out.println("Smallest of three  is ==>"+res);
	}
	
	
	public static int Smallest(int A,int  B,int C) {
		int Z=0;
		
		while(A!=0 && B!=0  && C!=0) {
			A--;
			B--;
			C--;
			Z++;
			
		}
		
		return Z;
	}

}
