package cdac;

public class P3 {

	public static void main(String[] args) {
		// 3. Convert Decimal Number to Octal Number. [Solution]
  int decimal=148;
  int octal[]=new int[20];
  int i=0;
  while(decimal>0) {
	  int r=decimal%8;
	  octal[i++]=r;
	  decimal=decimal/8;
  }
  System.out.println("Octal Number==>");
  for( i=i-1;i>=0;i--) {
	  System.out.print(octal[i]+" ");
  }
  System.out.println();
	}

}
