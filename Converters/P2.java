package cdac;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// 2. Convert Binary Number to Decimal Number. [Solution]
   
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Binary Number==");
		int binary=sc.nextInt();
		int decimal=0;
		int n=0;
		
		while(binary>0) {
			int temp=binary%10;
			decimal+=temp*Math.pow(2, n);
			binary=binary/10;
			n++;
			
		}
		System.out.println("Decimal Number is = "+decimal);
		
	}

}
