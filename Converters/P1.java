package cdac;

public class P1 {

	public static void main(String[] args) {
		// 1. Convert Decimal Number to Binary Number. [Solution] 
  
		int decimal=12;
		int binary[]=new int [20];
		int i=0;
		while(decimal>0) {
			int r=decimal%2;
			binary[i++]=r;
			decimal=decimal/2;
		}
		System.out.println("Decimal to binary=");
		for( i=i-1;i>=0;i--) {
			System.out.print(binary[i]+" ");
		}
		System.out.println();
	}

}
