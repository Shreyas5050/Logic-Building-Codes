package cdac;

import java.util.Scanner;
import java. io. *;
public class P4 {

	public static void main(String[] args) {
		// Check whether the Given Number is a Palindrome or NOT.
		Scanner SC= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=SC.nextInt();
		int temp=n;
		int rev=0;
		int rem;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		
		System.out.println(rev);
	
	if(temp==rev) {
			
			System.out.println(temp+" is a Palindrome");
			
		}
		else {
		System.out.println(temp+"is not a Palindrome");
		}

	}

}
