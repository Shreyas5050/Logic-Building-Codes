package cdac;

import java.util.Arrays;

public class P7 {

	public static void main(String[] args) {
		// 7. Write a Java Program to check two strings are Anagram to each other or NOT. [Solution]

		String s1="gram";
		String s2="arm";
		char [] str1=s1.toCharArray();
		char [] str2=s2.toCharArray();
		
		if(Anagram(str1,str2)) {
			System.out.println("Both string are Anagram to each other");
		}
		else {
			System.out.println("Both string are not Anagram to each other");
		}
	}
	
	static boolean Anagram(char[] s1,char [] s2) {
		int n1=s1.length;
		int n2=s2.length;
		
		if(n1!=n2) {
			return false;
		}
		Arrays.sort(s1);
		Arrays.sort(s2);
		for(int i=0;i<n1;i++) {
			if(s1[i]!=s2[i]) {
				return false;
			}
		}
		
		return true;
	}

}
