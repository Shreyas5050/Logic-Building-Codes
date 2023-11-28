package cdac;

import java.util.Scanner;
import java.util.Stack;

public class P1 {

	public static void main(String[] args) {
		/*1. Write a Java Program to find out whether the given string is Balanced Parenthesesor NOT? [Solution]

				()() 	- VALID
				(()) 	- VALID
				())( 	- INVALID
				((	- INVALID
       */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Parentheses==>");
		String str=sc.next();
		
		if(check(str)==0) {
			System.out.println("Invalid");
		}
		else {
			System.out.println("Valid");
		}
	}
	
	
public static int check(String str) {
	Stack<Character> s= new Stack<Character>();
	for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		if(c=='(') {
			s.push('(');
			System.out.println(s);
		}
		
		else if(c==')') {
			if(s.isEmpty()) {
				System.out.println(s);
				return 0;
			}
			else {
				char p=s.peek();
				System.out.println(p);
				if(p=='(') {
					s.pop();
					System.out.println(p+"pop");
					System.out.println(s);
				}
				else {
					return 0;
				}
			}
		}
	}
	if(s.empty()) {
		return 1;
	}
	else {
		return 0;
	}
}
}
