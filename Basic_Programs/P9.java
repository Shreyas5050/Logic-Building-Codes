package Cdac;

public class P9 {

	public static void main(String[] args) {
		//  Write a Java Program to Print 1 To 10 Without Using Loop.
   int n =1;
   printNum(n);
	}
	
	static void printNum(int num) {
	
	if(num<=10) {
		System.out.print(num+ " ");
	
		printNum(num+1);
	}

	}

}
