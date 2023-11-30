package cdac;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// Write a java program to LCM of TWO given number using Prime Factors method.
Scanner SC=new Scanner(System.in);
System.out.println("Enter the  1 Num");
int num1=SC.nextInt();
System.out.println("Enter the  2  Num");
int num2=SC.nextInt();

int cal=CalculateLCM(num1,num2);
System.out.println("LCM By Prime Factorization Method-->"+cal);
	}
	
	static int CalculateLCM(int a,int b) {
		int max=Math.max(a, b);
		System.out.println(max);
		
		int primecount1[]=new int [max+1];
		int primecount2[]=new int [max+1];
		
		primeFactors(a,primecount1);
		primeFactors(b,primecount2);
		
		int lcm=1;
		for(int i=2;i<=max;i++) {
		int 	maxcount=Math.max(primecount1[i],primecount2[i]);
		System.out.println(maxcount);
			if(maxcount>0) {
				lcm=(int) (lcm*Math.pow(i, maxcount));
			}
		}
		return lcm;
	}

	private static void primeFactors(int n, int[] primecount) {
		// TODO Auto-generated method stub
		for(int i=2;i<=n;i++) {
			while(n%i==0) {
				primecount[i]++;
				n=n/i;
			}
		}
		
	}
	
	

}
