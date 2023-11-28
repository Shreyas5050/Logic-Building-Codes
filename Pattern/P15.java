package cdac;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		for(char i='A';i<='E';i++) {
			
			for(char j='E';j>i;j--) {
				System.out.print(" "+" ");
			}
			
			for(char k='A';k<=i;k++) {
				System.out.print(k+" ");
			}
			
			for(char l='A';l<i;l++) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}

}

//        A
//      A B A
//    A B C B A
//  A B C D C B A
//A B C D E D C B A
