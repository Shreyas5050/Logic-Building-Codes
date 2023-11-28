package cdac;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// 3. Write the Java Program to print the following series Pattern Series[Solution]
        //3, 33, 333, 3333, 33333, 333333 ....
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number==");
		int num=Sc.nextInt();
		int temp=num;
		int  n=7;
		while(n>0) {
			System.out.print(num+" , ");
			num=num*10+temp;
			n--;
		}

	}

}
