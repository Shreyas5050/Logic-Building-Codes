  package cdac;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		//13. Write a Java Program to check whether the given number is Ramanujam's Number or NOT.

		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		int oriNum=sc.nextInt();
		int sum=findsum(oriNum);
		int reverse=reverse(sum);
		System.out.println(sum+" "+ reverse);
		if((sum*reverse)==oriNum) {
			System.out.println(oriNum+" is an Ramanujam Number ");
		}
		else {
			System.out.println(oriNum+" is Not an Ramanujam' Number");
		}
	}
	
	static int findsum(int n) {
		int temp;
		int sum=0;
		while(n>0) {
			temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		return sum;
	}
	
	static int reverse(int num) {
		int reverse=0;
		int temp;
		while(num>0) {
			temp=num%10;
			reverse=reverse*10+temp;
			num=num/10;
		}
		return reverse;
	}

}
