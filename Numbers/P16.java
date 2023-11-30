package cdac;

import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		// 16.Write a Java Program check whether the given number is Smith Numberor NOT. 

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=FindSum(num);
		int primFact=FindPrimeFact(num);
		System.out.println(sum);
		System.out.println(primFact);
		
		if(sum==primFact) {
			System.out.println(num+" is a Smith Number");
		}
		else {
			System.out.println(num+" is not a Smith Number");
		}
	}
	
	
	static int FindSum(int num) {
		int sum=0;
		while(num>0) {
			int temp=num%10;
			sum+=temp;
			num=num/10;
		}
		return sum;
	}
	
	static int FindPrimeFact(int n) {
		
		int sum=0;
		int i=2;
		while(n>1) {
			if(n%i==0) {
				sum=sum+FindSum(i);
				//System.out.println(sum);
				n=n/i;
			}
			
			else {
				do
				{
					i++;
				}while(!isprime(i));
			}
		}
		return sum;
		
	}
	static boolean isprime(int k)  
	{  
	boolean b=true;  
	int d=2;  
	while(d<Math.sqrt(k))  
	{  
	if(k%d==0)  
	{  
	b=false;  
	}  
	d++;  
	}  
	return b;  
	}  

}
