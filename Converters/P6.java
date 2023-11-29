package cdac;

public class P6 {

	public static void main(String[] args) {
		//6. Convert Hexadecimal to Decimal. [Solution]
  String hex="C9";
  int s=convert(hex);
  System.out.println(s);
	}
	static int convert(String hex) {
		String digit="0123456789ABCDEF";
		hex=hex.toUpperCase();
		int val=0;
		for(int i=0;i<hex.length();i++) {
			char c=hex.charAt(i);
			int d=digit.indexOf(c);
			System.out.println(d);
			val=val*16+d;
		}
		return val;
	}

}
