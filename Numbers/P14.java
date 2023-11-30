package cdac;

public class P14 {

	public static void main(String[] args) {
		// Write a Java Program check whether the given number is Automorphic Numberor NOT

		
		System.out.println(isAutomorphic(76)?"Automorphic":"Not Automorphic");
		System.out.println(isAutomorphic(13)?"Automorphic":"Not Automorphic");
	}
	
	static boolean isAutomorphic(int num) {
		int square=num*num;
		while(num>0) {
			if(num%10!=square%10) {
				return false;
			}
			num=num/10;
			square=square/10;
		}
		return true;
	}

}
