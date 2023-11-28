package cdac;

public class P33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i='E';i>='A';i--) {
		
			for(char j='A';j<i;j++) {
				System.out.print(" "+" ");
			}
			
			for(char k='A';k<=((char)(('E'-i)+'A'));k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}
} 

//
//        A
//      A B
//    A B C
//  A B C D
//A B C D E
