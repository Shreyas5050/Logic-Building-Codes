package cdac;

public class P8 {

	public static void main(String[] args) {
		// 8. Convert Binary Number to Octal. [Solution]
		int binary=1010;
		int decimal=0;
		int n=0;
		while(binary>0) {
			int r=binary%10;
			decimal+=r*Math.pow(2, n);
			binary=binary/10;
			n++;
		}
		System.out.println(decimal);
		int i=0;
		int octal[]=new int [20];
		while(decimal>0) {
			int r= decimal%8;
			octal[i++]=r;
			decimal=decimal/8;
		}
System.out.println("Octal Number==");
		for(i=i-1;i>=0;i--) {
			System.out.print(octal[i]);
		}
	}

}
