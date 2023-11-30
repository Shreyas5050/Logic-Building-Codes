package cdac;

import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		// Write a Java Program to print Automorphic Number between 1 to 1000.

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the start number");
		int start =sc.nextInt();
		System.out.println("Enter the end number");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++) {
			if(isAutomorphic(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	static boolean isAutomorphic(int num) {
		int count=0;
		int square=num*num;
		int temp=num;
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		int lastdigit=((int)(square%Math.pow(10, count)));
		
		
		return num==lastdigit;
	}

}
