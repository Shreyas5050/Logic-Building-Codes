package cdac;

public class P7 {

	public static void main(String[] args) {
		// 7. Convert Octal to Binary Number. [Solution]
		
	int octal=12;
	int decimal=0;   ;
	int n=0;
	while(octal>0) {
		int r=octal%10;
		decimal+=r*Math.pow(8, n);
		octal=octal/10;
		n++;
		
		
	}
	System.out.println(decimal);
	int binary[]=new int [20];
	int i=0;
	while(decimal>0) {
		int r=decimal%2;
		binary[i++]=r;
		decimal=decimal/2;
	}
	System.out.println("Binary conversion");
	for(i=i-1;i>=0;i--) {
		System.out.print(binary[i]+" ");
	}
	}

}
