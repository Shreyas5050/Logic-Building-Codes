package cdac;

public class P24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(char i='A';i<='E';i++){
				for(char j='E';j>=i;j--) {
					System.out.print(" "+" ");
				}
				for(char k='A';k<=i;k++) {
					System.out.print(i+" ");
				}
				for(char l='A';l<i;l++) {
					System.out.print(i+" ");
				}
				System.out.println();
	}
	}
}
//        A
//      B B B
//    C C C C C
//  D D D D D D D
//E E E E E E E E E