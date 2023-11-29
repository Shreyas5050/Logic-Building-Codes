package cdac;

import java.util.ArrayList;

public class P5 {

	public static void main(String[] args) {
		// 5. Write a java program to Count the Number of Vowelsin the given string. [Solution]

		String str= "CDACMumbai";
		str=str.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e'
					  || str.charAt(i)=='i' ||  str.charAt(i)=='o'  || 
					  str.charAt(i)=='u')
			count++;
		}
		System.out.println("Vowels in the "+str+" is= "+count);
		
		
		String vow=" aeiou";
		ArrayList<Character> ap= new ArrayList<Character>();
		int count1=0;
		for(int i=0;i<vow.length();i++) {
			ap.add(vow.charAt(i));
		}
		for(int i=0;i<str.length();i++) {
			if(ap.contains(str.charAt(i))){
				count1++;
			}
			
			
		}
		System.out.println("Vowels ="+count1);
	}

}
