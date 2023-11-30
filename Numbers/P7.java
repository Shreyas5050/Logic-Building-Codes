package cdac;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		//  Write a Java Program to print Prime Numbers from 1 to N.

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number upto which prime numbers series u want==> ");
		int N=sc.nextInt();
		System.out.println("Prime number=");
		for(int i=2;i<=N;i++) {
			if(Isprime(i)) {
				System.out.print(i+" ");
			}
			
		}
	}
	static boolean Isprime(int Num ) {
		int count=0;
		
		
		for(int i=1;i<=Num;i++) {
			if(Num%i==0) {
				count++;
			}
		}
		if(count>2) {
			return false;
		}
		return true;
	}

}
