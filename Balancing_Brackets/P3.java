package cdac;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
	/*	3. Generate All possible combinations of Parentheses.

		N = 2		N= 3
		()		()
		()()		()()
		(())		(())
				()()()
				(())()
				()(())
				(()())
				((()))
*/
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number for combination");
		int n1=Sc.nextInt();
		for(int i=1;i<=n1;i++) {
		generateParentheses(i);
		}
	}
	 public static void generateParentheses(int n) {
	        generateParenthesesHelper("", 0, 0, n);
	        System.out.println("gen");
	    }
	 private static void generateParenthesesHelper(String current, int open, int close, int n) {
	        // Base case: if the length is equal to 2*n, print the current combination
	        if (current.length() == 2 * n) {
	            System.out.println(current);
	           
	            return;
	        }

	        // Recursive cases:
	        // Add an open parenthesis if the count of open parentheses is less than n
	        if (open < n) {
	            generateParenthesesHelper(current + "(", open + 1, close, n);
	          System.out.println("Open");
	        }

	        // Add a close parenthesis if the count of close parentheses is less than open parentheses
	        if (close < open) {
	            generateParenthesesHelper(current + ")", open, close + 1, n);
	         System.out.println("Close");
	        }
	    }

}
