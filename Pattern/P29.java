package cdac;

public class P29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		for(char i='E';i>='A';i--) {
			
			
			for(char j='E';j>i;j--) {
				System.out.print(" "+" ");
			}
			
			for(char k='A';k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}



//E E E E E
//  D D D D
//    C C C
//      B B
//        A