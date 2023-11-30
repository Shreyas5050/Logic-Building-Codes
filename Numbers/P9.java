package cdac;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		//Write a Java Program to print Armstrong Numbers between 1 to 1000.

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter low and high values ");
		int low=sc.nextInt();
		int high=sc.nextInt();
		System.out.println("Armstrong Values in the given range");
		for(int i=low;i<=high;i++) {
			int temp,digit,len;
			len=Getorder(i);
			int sum=0;
			temp=i;
			while(temp>0) {
				digit=temp%10;
				sum+=(int)Math.pow(digit, len);
				temp=temp/10;
			}
			
			
			if(sum==i) {
				System.out.print(i+"  ");
			}
			
		}
	
		
		
	}
	static int Getorder(int num) {
		int len=0;
		while(num>0) {
			int temp=num%10;
			
			len++;
			num=num/10;
		}
		return len;
				
	}

}
