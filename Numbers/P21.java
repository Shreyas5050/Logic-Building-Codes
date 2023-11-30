package cdac;

public class P21 {

	public static void main(String[] args) {
		// Find the All Divisors of a Given number N.
		 System.out.println("The divisors of 100 are: "); 
	        printDivisors(100);; 
	}
	
	  static void printDivisors(int n) 
	    { 
	        for (int i=1;i<=n;i++) 
	            if (n%i==0) 
	                System.out.print(i+" "); 
	    } 

}
