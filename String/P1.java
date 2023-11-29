package cdac;

public class P1 {

	public static void main(String[] args) {
		//1. Write a java program to check Given String is Palindrome or NOT.
 
		String S1="ABA";
		String Rev="";
		
		int n=S1.length();
	   
		for(int i=n-1;i>=0;i--) {
			Rev=Rev+ S1.charAt(i);
		}
		System.out.println(Rev);
		if(S1.equals(Rev)) {
			System.out.println("It is an Palindrome="+S1);
		}
		else {
			System.out.println("It is Not Palindrome="+S1);
		}
	}

}
