package cdac;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		for(char i='E';i>='A';i--) {
			for(char j='A';j<i;j++) {
				System.out.print(" "+" ");
			}
			
			for(char k='E';k>=i;k--) {
				System.out.print((char)(k-i+'A')+" ");
			
			}
			
			
			for(char l='B';l<((char)('E'-i+'B'));l++) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}

}
//        A 
//      B A B
//    C B A B C
//  D C B A B C D
//E D C B A B C D E