package cdac;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// 12.Write a Java Program to check whether the given numbers are Amicable Numbersor NOT.

		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first Number");
		int first=sc.nextInt();
		System.out.println("Enter the Second Number");
		int second= sc.nextInt();
		int sum1=0;
		int sum2=0;
		
		for(int i=1;i<first;i++) {
			if(first%i==0) {
				sum1=sum1+i;
			}
		}
		
		for(int i=1;i<second;i++) {
			if(second%i==0) {
				sum2=sum2+i;
			}
		}
		System.out.println(sum1+" "+sum2);
		if(sum1==second) {
			System.out.println("Numbers are Amicable");
		}
		else {
			System.out.println("Numbers are not Amicable");
		}
		
	}

}
