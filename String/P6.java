package cdac;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class P6 {

	public static void main(String[] args) {
		// 6. Check Given String is Rotation of Another String. [Solution]
  
		
		String s1="AACD";
		String s2="ACDA";
		
		boolean flag=Check(s1,s2);
		if(flag)
			System.out.println(s1+" and "+s2+" are rotation of each other");

		else {
			System.out.println(s1+" and "+s2+" are not rotation of each other");

		}
	}
	static boolean Check(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		Queue<Character> q1= new LinkedList<Character>();
		for(int i=0;i<s1.length();i++) {
			q1.add(s1.charAt(i));
		}
		System.out.println(q1);
		Queue<Character> q2=new LinkedList<Character>();
		for(int i=0;i<s2.length();i++) {
			q2.add(s2.charAt(i));
		}
		System.out.println(q2);
		
		int k=s2.length();
		if(k>0) {
			k--;
			char ch=q2.peek();
			System.out.println(ch+" "+q2);
			q2.remove();
			System.out.println(q2);
			q2.add(ch);
			System.out.println(q2);
			if(q2.equals(q1)) {
				return true;
			}
		}
		return false;
	}

}
