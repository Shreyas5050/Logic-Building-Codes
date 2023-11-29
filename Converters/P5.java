package cdac;

public class P5 {

	public static void main(String[] args) {
		// 5. Convert Decimal to Hexadecimal. [Solution]
int decimal=1457;
convert(decimal);
	}
	
	static void convert(int decimal) {
		char [] hexa=new char[100];
		int i=0;
		while(decimal!=0) {
			int r=0;
			r=decimal%16;
			if(r<10) {
				hexa[i]=(char)(r+48);
				i++;
			}
			else {
				hexa[i]=(char)(r+55);
				i++;
			}
			decimal=decimal/16;
			
		}
		System.out.println("Hexadecimal=");
		for(i=i-1;i>=0;i--) {
			System.out.print(hexa[i]);
		}
		
		
		
		
		
	}

}
