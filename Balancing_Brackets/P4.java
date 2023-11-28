package cdac;

import java.util.Scanner;

public class P4 {
 static int  count=0;
	public static void main(String[] args) {
		/*4. Count the Number of possible combinations of Parentheses.

		N = 2		N= 3
		()	     	()
		()()		()()
		(())		(())
		Output = 3	()()()
				    (())()
				    ()(())
				    (()())
				    ((()))
				    Output = 8
*/
		Scanner SC =new Scanner(System.in);
		System.out.println("Enter the  number for Combinations");
		int n=SC.nextInt();
		for(int i=1;i<=n;i++) {
		Geneeratebrac(i);
		}
		System.out.println("Output: "+ count);
	}
	
	static void Geneeratebrac(int n) {
		GeneratePara("",0,0,n);
	}

	private static void GeneratePara(String current, int open, int close, int n) {
		
		if(current.length()==2*n) {
			System.out.println(current);
			count++;
			return;
		}
		if(open<n) {
			GeneratePara(current+'(', open+1, close, n);
		}
		if(close<open) {
			GeneratePara(current+')',open,close+1,n);
		}
		
	}
	

}
