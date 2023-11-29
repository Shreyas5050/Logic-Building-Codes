package cdac;

public class P4 {

	public static void main(String[] args) {
		//4. Convert Octal Number to Decimal Number. [Solution]
    int octal=224;
    int decimal=0;
    int n=0;
    while(octal>0) {
    	int temp=octal%8;
    	decimal+=temp*Math.pow(8, n);
    	octal=octal/8;
    	n++;
    }
    System.out.println("Decimal Number==>");
    System.out.println(decimal);
	}

}
