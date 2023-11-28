package cdac;

public class P23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 char a='I';
		for(char i='A';i<='I';i+=2,a--) {
			for(char k='A';k<=a;k++) {
				System.out.print(" "+" ");
			}
			for(char j='A';j<='I';j++) {
				if(j<=i)
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
//        A
//      C C C
//    E E E E E
//  G G G G G G G
//I I I I I I I I I