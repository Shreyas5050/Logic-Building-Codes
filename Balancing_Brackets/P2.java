package cdac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	2. Generate Balanced Parentheses of N pairs. [Solution]

				N = 2		N= 3
				()()		()()()
				(())		(())()
						()(())
						(()())
						((()))
						*/
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number for combination");
		int n=Sc.nextInt();
		String s="";
		List<String> ans= new ArrayList<String>();
		generatebrackets(n,n,s,ans);
		for(String k: ans) {
			System.out.println(k+" ");
		}
	}
	static void generatebrackets(int left,int right,String s,List<String>ans) {

		if(left==0 && right==0) {
			ans.add(s);
		}
		if(left>right || left<0 || right<0) {
			return;
		}
		s=s+"(";
		generatebrackets(left-1, right, s, ans);
		s=s.substring(0, s.length()-1);
		
		s=s+")";
		generatebrackets(left, right-1, s, ans);
		s=s.substring(0, s.length()-1);
		
	}

}
