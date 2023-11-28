package Cdac;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
	//	Find the Factorialof a number using Recursion.
  Scanner SC =new Scanner(System.in);
  System.out.println("Enter the Number");
  int num=SC.nextInt();
  
  int result=Fact(num);
  
  System.out.println("Factorial of "+num+ " IS ="+result);
	}

	public static int Fact(int num) {
		if(num==0) {
			return 1;
		}
		
		return num*Fact(num-1);
	}
}
